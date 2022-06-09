package exam;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 
 * @author ������
 * 
 * ��Ŭ������ ���� ������ ���� �ϴ� Ŭ������.
 * �����ڷ� ����ڰ� �ʱ�ȭ �ϰ�, init() �ʱ�ȭ �޼��带 ���� ������������ ��ġ�� ������.
 *
 */
public class Gamer {
	
	private String input;//����� �Է°�
	private static int[] chgValue = {0,1,2};
	private Random random;
	private int gameResult;//0 ���º�,1 ���� ��, 2 �� ��
	private int com;//���� ������. ����ڿ��� ����� �����ִ� ����� ���� Ŭ�������� �ϱ� ������ �ʵ�� ������.
	
	public Gamer(String input) {
		this.input = input;
		//����� ���� ���ڷ� �����ϴ� �ʱ�ȭ �޼��� ȣ��..�Ϲ�������  init() ������ ���� �����.
		init();
	}
	private void init() {
		//������ü �ʱ�ȭ..���� �޼��常 ȣ���ϸ� ������ ������.
		random = new Random();
		for(int i = 0; i<chgValue.length; i++) {
			if(input.startsWith("��")) {
				play(chgValue[0]);
				return;
			}else if(input.startsWith("��")) {
				play(chgValue[1]);
				return;
			}else if(input.startsWith("��")) {
				play(chgValue[2]);
				return;
			}
		}
		
	}
	private void play(int userVal) {
		//��ǻ�� �� ����.
		com = random.nextInt(3);
		//���� �˻�.
		if(userVal == com) {
			//���º�.
			gameResult = 0;
		}else if((userVal == 0 && com == 2) || (userVal == 1 && com == 0) || (userVal == 2 && com == 1)){//����ڰ� �̱�� ���� ����..
			//���� ��
			gameResult = 1;
		}else if((userVal == 0 && com == 1) || (userVal == 1 && com == 2) || (userVal == 2 && com == 0)){
			//��ǻ�� ��..
			gameResult = 2;
		}
	}
	//����Ŭ�������� ���� ��� Ȯ�ν� �ʿ�
	public int getGameResult() {
		return gameResult;
	}
	//����Ŭ�������� �İ� Ȯ�ν� �ʿ�
	public int getCom() {
		return com;
	}
}
