
import java.io.IOException;

public class Program {

	/**
	 * Main class Do NOT modify anything in here
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Program p = new Program();
		p.start();

		// Done
		System.in.read();
	}

	/**
	 * World method with test data Do NOT modify anything in here
	 * 
	 * @throws IOException
	 */
	public void start() throws IOException {
		// Say you have a hierarchy of countries...
		// Rules:
		// The world can contain countries
		// Countries can contain: Districts, Cities, and/or States
		// States can contain: Cities and/or districts
		// Cities and Districts can not contain anything, but have a population

		// 1. Get the following to compile
		Country canada = new Country("Canada", new District("Quebec", 13244), new City("Toronto", 111237),
				new District("Alberta", 12312328));
		Country usa = new Country("USA", new District("Washington D.C.", 632323),
				new State("Florida", new City("Miami", 408568), new City("Ft. Lauderdale", 234000),
						new City("Orlando", 600876)),
				new State("Georgia", new City("Atlanta", 8675309), new City("Savannah", 42004)),
				new State("Texas", new City("Austin", 908712), new City("Dallas", 1256709)));
		Country germany = new Country("Germany", new City("Berlin", 800762), new City("Frankfurt", 123412), new State(
				"Bavaria", new City("Furth", 114071), new City("Kempten", 62135), new District("Altotting", 909091)));

		// Build the world
		World theWorld = new World(canada, usa, germany);

		// 2. Get the world population
		long worldPopulation = theWorld.getPopulation();
		System.out.printf("The world population is: %d", worldPopulation);

		// 3. Print the names of all the countries, states, cities, and
		// districts
		// in the order in which they were declared
		theWorld.printWorld();
	}

	public class Place {
		String name;
		int population;

		public int getPopulation() {
			return population;
		}

		public String getNames() {
			return name;
		}
	}

	public class City extends Place {

		public City(String string, int i) {
			this.name = string;
			this.population = i;
		}
	}

	public class District extends Place {

		public District(String string, int i) {
			this.name = string;
			this.population = i;
		}
	}

	interface GroupPlaces {
		public int getPopulation();

		public String getNames();

	}

	public class State extends Place implements GroupPlaces {
		int total = 0;
		String names = "";

		public State(String string, Place... places) {
			names = string + ",";
			for (Place place : places) {
				total += place.getPopulation();
				names += place.getNames() + ",";
			}
		}

		public int getPopulation() {
			return total;
		}

		public String getNames() {
			return names;
		}

	}

	public class Country implements GroupPlaces {
		int total = 0;
		String names = "";

		public Country(String string, Place... places) {
			names = string + ",";
			for (Place place : places) {
				total += place.getPopulation();
				names += place.getNames() + ",";
			}
		}

		public int getPopulation() {
			return total;
		}

		public String getNames() {
			return names;
		}

	}

	public class World {
		int total = 0;
		String names = "";

		public World(Country... entities) {
			for (Country c : entities) {
				total += c.getPopulation();
				names += c.getNames() + ",";
			}
		}

		public long getPopulation() {
			return total;
		}

		public void printWorld() {
			System.out.println();
			names = names.replace(",,,", ",");
			System.out.println(names.replace(",,", ","));
		}
	}
}
