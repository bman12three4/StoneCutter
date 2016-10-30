package lib.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.byronlathi.game.CadFile;
import com.byronlathi.game.Color;
import com.byronlathi.game.Job;
import com.byronlathi.game.Material;
import com.byronlathi.game.Slab;

/**
 * @author Byron Lathi
 *
 */
public class JobReader {
	public static Job createJob(File f) {
		Job j;
		JSONParser parser = new JSONParser();
		Reader reader = null;
		JSONArray array = null;
		try {
			reader = new FileReader(f);
		} catch (FileNotFoundException e) {
		}
		try {
			Object obj = parser.parse(reader);
			array = (JSONArray)obj;
		} catch (IOException e) {
		} catch (ParseException e) {
		}
		
		String name = array.get(0).toString();
		CadFile file = (CadFile) array.get(1);
		Material material = (Material) array.get(2);
		Color color = (Color) array.get(3);
		Slab slab = (Slab) array.get(4);
		Date date = (Date) array.get(5);
		
		return j = new Job(name, file, material, color, slab, date);

	}
}
