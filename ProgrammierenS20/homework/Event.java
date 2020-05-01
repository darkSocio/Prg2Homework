package homework;


public class Event {

	private String name;
	private String ort;
	private String datum;

	public Event(String name, String ort, String datum) {
		this.name = name;
		this.ort = ort;
		this.datum = datum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getDatum() {
		return datum;
	}

	

	public void setDatum(String datum) {
		this.datum = datum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (obj == null)
			return false;
		else if (!(obj instanceof Event))
			return false;

		Event other = (Event) obj;
		if (name == other.getName() && ort == other.getOrt() && datum == other.getDatum())
			return true;
		else
			return false;
	}



}