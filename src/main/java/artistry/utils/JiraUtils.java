package artistry.utils;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JiraUtils {

	@Value("${jira.username}")
	private String jiraUser;

	@Value("${jira.password}")
	private String jiraPass;

	public String makeBase64Credentials() {
		final String plainCreds = jiraUser + ":" + jiraPass;
		final byte[] plainCredsBytes = plainCreds.getBytes();
		final byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
		return new String(base64CredsBytes);
	}

//	public String makePostRequestToCreateBoard(AgileBoard agileBoard, Long[] projects) {
//		String resource = "/rest/greenhopper/1.0/rapidview/create/presets";
//		Gson json = new Gson();
//		DataForBoardRequest dataForBoardRequest = new DataForBoardRequest();
//		dataForBoardRequest.setName(agileBoard.getBoardName());
//		String projectId[] = new String[projects.length];
//		for (int i = 0; i < projects.length; i++) {
//			projectId[i] = String.valueOf(projects[i]);
//		}
//		dataForBoardRequest.setProjectIds(projectId);
//		dataForBoardRequest.setPreset(agileBoard.getBoardType());
//		String stringObject = json.toJson(dataForBoardRequest);
//		
////		String requestUrl = String.format("%s%s", baseUrl, resource.getUrl());
////		WebResource webResource = jerseyClient.resource(requestUrl);
////		String postAnswer = webResource.header("Authorization", "Basic " + authString).type(MediaType.APPLICATION_JSON)
////				.accept(MediaType.APPLICATION_JSON).entity(stringObject).post(String.class);
//
//		return postAnswer;
//
//	}

}
