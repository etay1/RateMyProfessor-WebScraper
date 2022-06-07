package handler;
import com.amazonaws.services.lambda.runtime.Context;
import org.json.JSONObject;
import com.google.gson.*;
import java.io.IOException;
import java.util.Scanner;

public class LambdaHandler {
    public String handleRequest(String input, Context context) throws IOException {

        context.getLogger().log("User input: " + input);
        RateMyProfessor professor = new RateMyProfessor(input);

        JSONObject json = new JSONObject();
        //Inserting key-value pairs into the json object
        json.put("Professor", professor.getName());
        json.put("University", professor.getUniversity());
        json.put("Department", professor.getDepartment());
        json.put("Overall Rating", professor.getRating());
        json.put("Level of Difficulty", professor.getLevelOfDifficulty());
        json.put("Recent Comment", professor.getRecentComment());

        //format json and beautify -> return
        String sJson = json.toString();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement je = JsonParser.parseString(sJson);
        String prettyJsonString = gson.toJson(je);
        return prettyJsonString;

    }

}
