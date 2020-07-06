
try {
	var responseCode = parseInt(context.getVariable('response.status.code'));

	var log = {
		org: context.getVariable('organization.name'),
		env: context.getVariable('environment.name'),
		responseCode: responseCode,
		isError: (responseCode >= 400)
	};

	if (log.isError) {
		log.errorMessage = context.getVariable('flow.error.message');
	}

	var logglyRequest = new Request(
			'https://loggly.com/aaa', 
			'POST', 
			{'Content-Type': 'application/json'}, 
			JSON.stringify(log)
	);
	httpClient.send(logglyRequest);
} catch (e) {
	
}

