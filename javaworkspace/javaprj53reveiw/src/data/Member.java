package data;

public class Member {
	
	public Member(String id, String pwd, String nick) {
		this.nick = nick;
		this.id = id;
		this.pwd = pwd;
	}
	public Member() {
	}
	private String nick;
	private String id;
	private String pwd;
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Member [nick=" + nick + ", id=" + id + ", pwd=" + pwd + "]";
	}
	
}
