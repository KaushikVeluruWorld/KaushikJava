package jsonParse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.*;

public class Parse {

	static Map<String, String> androidToHTML;
	static Map<String, String> androidToCSS;
	static ArrayList<String> cssList=new ArrayList<String>();
	public final String JSON_DATA =
			"{" 
					+ "  \"Components\": [" 
					+ "    {" 
					+ "      \"Name\": \"Button1\"," 
					+ "      \"Type\": \"Button\","                  
					+ "      \"Version\" : \"6\"," 
					+ "      \"Uuid\" : \"-85218753\"," 
					+ "      \"BackgroundColor\" : \"&HFF0000FF\","
					+ "      \"FontBold\" : \"True\","
					+ "      \"FontItalic\" : \"True\","
					+ "      \"FontTypeface\" : \"2\","
					+ "      \"Image\" : \"usecaseDiagram.png\","
					+ "      \"Text\" : \"Demo Button\","
					+ "      \"TextColor\" : \"&HFFFFFFFF\","
					+ "      \"Visible\" : \"True\","
					+ "      \"Width\" : \"100\","
					+ "      \"Enabled\" : \"True\","
					+ "      \"Height\" : \"100\""
					+ "    }," 
					+ "    {" 
					+ "      \"Name\": \"Button2\"," 
					+ "      \"Type\": \"Button\","                  
					+ "      \"Version\" : \"6\"," 
					+ "      \"Uuid\" : \"-85218753\"," 
					+ "      \"BackgroundColor\" : \"&HFF0000FF\","
					+ "      \"FontBold\" : \"True\","
					+ "      \"FontItalic\" : \"False\","
					+ "      \"FontTypeface\" : \"2\","
					+ "      \"Visible\" : \"False\","
					+ "      \"Width\" : \"Automatic\","
					+ "      \"Enabled\" : \"False\","
					+ "      \"Text\" : \"Demo Button2\","
					+ "      \"Height\" : \"100\""
					+ "    },"

		   +" {\"Name\":\"Label1\",\"Type\":\"Label\",\"Version\":\"3\",\"Uuid\":\"334753703\",\"BackgroundColor\":\"&HFF0000FF\",\"FontBold\":\"True\",\"FontItalic\":\"True\",\"FontSize\":\"16.0\",\"FontTypeface\":\"2\",\"HasMargins\":\"False\",\"Text\":\"TESTLABLE\",\"TextAlignment\":\"1\",\"TextColor\":\"&HFF444444\",\"Width\":\"100\",\"Height\":\"20\"},"
		   +" {\"Name\":\"TextBox1\",\"Type\":\"TextBox\",\"Version\":\"5\",\"Uuid\":\"-88103695\",\"BackgroundColor\":\"&HFFCCCCCC\",\"FontBold\":\"True\",\"FontItalic\":\"True\",\"FontSize\":\"16.0\",\"FontTypeface\":\"3\",\"Hint\":\"Hint TextBox1\",\"Text\":\"test text\",\"TextAlignment\":\"1\",\"TextColor\":\"&HFFFFAFAF\",\"Width\":\"100\",\"Height\":\"20\"},"

		   +"{\"Name\":\"TextBox2\",\"Type\":\"TextBox\",\"Version\":\"5\",\"Uuid\":\"-315586597\",\"FontBold\":\"True\",\"FontSize\":\"15.0\",\"Hint\":\"Hint for TextBox2\",\"MultiLine\":\"True\"},"
		   +"{\"Name\":\"PasswordTextBox1\",\"Type\":\"PasswordTextBox\",\"Version\":\"2\",\"Uuid\":\"1954035653\",\"BackgroundColor\":\"&HFF444444\",\"FontBold\":\"True\",\"FontItalic\":\"True\",\"FontSize\":\"15.0\",\"FontTypeface\":\"3\",\"Hint\":\"password hint\",\"Text\":\"rewq\",\"TextAlignment\":\"1\",\"TextColor\":\"&HFFFFC800\",\"Width\":\"100\",\"Height\":\"20\"},"
		   +"{\"Name\":\"CheckBox1\",\"Type\":\"CheckBox\",\"Version\":\"2\",\"Uuid\":\"-1889258357\",\"Checked\":\"True\",\"FontBold\":\"True\",\"FontItalic\":\"True\",\"FontSize\":\"16.0\",\"FontTypeface\":\"3\",\"Text\":\"Text fo\",\"TextColor\":\"&HFF888888\",\"Width\":\"100\",\"Height\":\"20\"},"
		   +"{\"Name\":\"ListView1\",\"Type\":\"ListView\",\"Version\":\"4\",\"Uuid\":\"1276881375\",\"ElementsFromString\":\"1,2,3,4,5\",\"Selection\":\"3\",\"TextColor\":\"&HFF00FFFF\",\"TextSize\":\"23\",\"Width\":\"100\",\"Height\":\"200\"}"
		   + "  ]" 
		   + "}"; 




	public ArrayList<String[]> parseJsonString(String jsonString) throws JSONException {
		
		final JSONObject obj = new JSONObject(jsonString);
		final JSONArray components = obj.getJSONArray("Components");		    
		String[] htmlCssString=new String[2];
		ArrayList<String[]> arrayList=new ArrayList<String[]>();
		for (int i = 0; i < components.length(); ++i) {
			final JSONObject component = components.getJSONObject(i);

			//System.out.println("component type: "+component.getString("Type"));

			if(component.getString("Type").equals("Button"))
			{
				Button b=new Button();
				htmlCssString=b.getConvertedButtonString(component);
			}
			else if(component.getString("Type").equalsIgnoreCase("Label"))
			{
				Label l=new Label();
				htmlCssString=l.getConvertedLabelString(component);
			}
			else if(component.getString("Type").equalsIgnoreCase("TextBox"))
			{
				TextBox tb=new TextBox();
				htmlCssString=tb.getConvertedTextBoxString(component);
			}
			else if(component.getString("Type").equalsIgnoreCase("PasswordTextBox"))
			{
				PasswordTextBox pstb=new PasswordTextBox();
				htmlCssString=pstb.getConvertedPasswordTextBoxString(component);
			}
			else if(component.getString("Type").equalsIgnoreCase("CheckBox"))
			{
				CheckBox cb=new CheckBox();
				htmlCssString=cb.getConvertedCheckBoxString(component);
			}
			/*		      else if(component.getString("Type").equalsIgnoreCase("Image"))
		      {
		    	 Image im=new Image();
		    	  htmlCssString=im.getConvertedImageString(component);
		      }*/
			else
			{
				if(component.getString("Type").equalsIgnoreCase("ListView"))
				{
					ListView lv=new ListView();
					htmlCssString=lv.getConvertedListViewString(component);
				}
			} 

			arrayList.add(htmlCssString);
			/*System.out.println(htmlCssString[0]);
			System.out.println(htmlCssString[1]);*/

		}
		return arrayList;
	}
	
	
	//testing
	public static void main(String args[]) 
	{
		try
		{
			Parse p=new Parse();
			p.parseJsonString(p.JSON_DATA);
			

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
