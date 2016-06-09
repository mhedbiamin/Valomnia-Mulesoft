package unit;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.junit.Test;
import org.mule.modules.valomnia.client.impl.AbstractValomniaClient;
import org.mule.modules.valomnia.entities.Item;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

public class TestAbstractValomniaClient {

	@Test
	public void testParseFromJsonArrayJsonParseException()

	{

		boolean thrown = false;
		@SuppressWarnings("unused")
		List<Item> response;

		try {

			response = AbstractValomniaClient.parseFromJson(new JsonArray(),
					Item.class);

		} catch (JsonParseException e) {
			thrown = true;

			assertTrue(thrown);
		}
	}

	@Test
	public void testGetResponseThrownHttpException()

	{

		boolean thrown = false;
		@SuppressWarnings("unused")
		HttpResponse response;

		try {

			response = AbstractValomniaClient.getResponse("get", "token",
					"valomnia.test.com");

		} catch (HttpException e) {
			thrown = true;
		} catch (IOException e) {
			thrown = true;
		}

		catch (IllegalStateException e) {
			thrown = true;
		}

		assertTrue(thrown);
	}
}
