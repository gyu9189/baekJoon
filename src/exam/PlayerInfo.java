package exam;

/**
 * 
 * @author ������
 * 
 * �� Ŭ������ ������� ���� ��� ������ �����ϴ� DTO 
 * �ʿ��� �ʵ� ������ setter, getter ��� ��������� �� �������� �ʾ���..
 * �ʿ信 ���� setter �� ���� ���� ������ ������ ����.
 *
 */
public class PlayerInfo {
	
	private String email;
	private String passwd;
	private int win;
	private int draw;
	private int lose;
	private int total;
	private double win_Rate;
	
	//�÷��� ����� ���� ��,��,�� �� �ڵ� ó���ϴ� �޼���..���� Ŭ�������� ���ϰ� ����
	public void autoSet(int result) {
		if(result == 0) {//���
			setDraw(1);
		}else if(result == 1) {//�̱�
			setWin(1);
		}else if(result == 2) {//��
			setLose(1);
		}
	}
	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win += win;
		setTotal();
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw += draw;
		setTotal();
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose += lose;
		setTotal();
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = this.win + this.lose + this.draw;
		setWin_Rate();
	}

	//�Ҽ��� 2�ڸ� ������ ǥ���ϵ��� String ��ü�� �޼��� �����.
	public String getWin_Rate() {
		return String.format("%.2f", this.win_Rate);
	}

	public void setWin_Rate() {
		try {
			this.win_Rate = this.getWin() / (double)this.getTotal() * 100.0;
		}catch (ArithmeticException e) {
			this.win_Rate = 0;
			System.out.println("����");
		}
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
