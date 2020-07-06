//sinon is required to mock objects
var sinon = require('sinon');

// this is the javascript file for which the mocha test cases are written

var jsFile = '../../apiproxy/resources/jsc/JavaScript-1.js';

var assert = require('assert');

global.context = {
	
	getVariable: function(s) {},
	
	setVariable: function(s) {}
};


global.httpClient = {

	send: function(s) {}

};
	

global.Request = function(s) {
	};


var contextGetVariableMethod, contextSetVariableMethod;
	
var httpClientSendMethod;
	
var requestConstructor;
	

// This method will be executed before every it() method in the test script
	

beforeEach(function () {
	
	// Stubbing Apigee objects and the methods we require
	contextGetVariableMethod = sinon.stub(context, 'getVariable');
	
	contextSetVariableMethod = sinon.stub(context, 'setVariable');
	
	requestConstructor = sinon.spy(global, 'Request');
		
	httpClientSendMethod = sinon.stub(httpClient, 'send');
	
	
});


// This method will restore all stubbed methods back to their original state
afterEach(function() {
	
		contextGetVariableMethod.restore();
	
		contextSetVariableMethod.restore();
	
		requestConstructor.restore();
	
		httpClientSendMethod.restore();
});
		



		describe('feature: logging messages to Loggly', function() {			
			
			it('should log success responses correctly', function() {
				contextGetVariableMethod.withArgs('organization.name').returns('org1');
				contextGetVariableMethod.withArgs('environment.name').returns('env1');
				contextGetVariableMethod.withArgs('response.status.code').returns('200');

				var errorThrown = false;
				try { 
						requireUncached(jsFile);
					} catch (e) { 
						errorThrown = true; 
						}

				assert.equal(errorThrown, false);

				assert.equal(httpClientSendMethod.calledOnce, true);
				assert.equal(requestConstructor.calledOnce,true);
				var requestConstructorArgs = requestConstructor.args[0];
				assert.equal(requestConstructorArgs[0], 'https://loggly.com/aaa');		
				assert.equal(requestConstructorArgs[1], 'POST');		
				assert.equal(requestConstructorArgs[2]['Content-Type'], 'application/json');		
				var logObject = JSON.parse(requestConstructorArgs[3]);
				assert.equal(logObject.org, 'org1');		
				assert.equal(logObject.env, 'env1');		
				assert.equal(logObject.responseCode, 200);		
				assert.equal(logObject.isError, false);
				
	});


	it('should log failure responses correctly', function() {
		contextGetVariableMethod.withArgs('organization.name').returns('org1');
		contextGetVariableMethod.withArgs('environment.name').returns('env1');
		contextGetVariableMethod.withArgs('response.status.code').returns('400');
		contextGetVariableMethod.withArgs('flow.error.message').returns('this is a helpful error message');


		var errorThrown = false;
		try {
			requireUncached(jsFile);
		} catch (e) { 
			errorThrown = true; 
			}


		assert.equal(errorThrown, false);

		assert.equal(httpClientSendMethod.calledOnce,true);
		assert.equal(requestConstructor.calledOnce, true);
		var requestConstructorArgs = requestConstructor.args[0];
		assert.equal(requestConstructorArgs[0], 'https://loggly.com/aaa');		
		assert.equal(requestConstructorArgs[1], 'POST');		
		assert.equal(requestConstructorArgs[2]['Content-Type'], 'application/json');		
		var logObject = JSON.parse(requestConstructorArgs[3]);
		assert.equal(logObject.org, 'org1');		
		assert.equal(logObject.env, 'env1');		
		assert.equal(logObject.responseCode, 400);		
		assert.equal(logObject.isError, true);
		assert.equal(logObject.errorMessage, 'this is a helpful error message');		
	});			


});


// node.js caches modules that is imported using 'require'

// this utility function prevents caching between it() functions

function requireUncached(module)
{
    
	delete require.cache[require.resolve(module)];
    
	return require(module);

}
