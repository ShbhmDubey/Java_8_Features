package javafeatures;

public class Emp {
    int eid;
    String ename;
    double esal;
	public Emp(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", " + (ename != null ? "ename=" + ename + ", " : "") + "esal=" + esal + "]";
	}
	
	public boolean equals(Emp othr) {
		if(this.eid==othr.eid && this.esal==othr.esal && this.ename.equals(othr.ename)) {
			return true;
		}
		return false;
		
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public boolean salaryCheck() {
		return this.esal>25000;
	}
	public boolean nameCheck() {
		return this.ename.length()>5;
	}
    
}
