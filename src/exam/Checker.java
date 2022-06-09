package exam;

import javax.swing.JOptionPane;

/**
 * 
 * @author ������
 * ������� �Է°��� �ùٸ��� ���� �� ���� Ƚ���� ���� ���α׷� ���� ��� �߰�.
 */
public class Checker {

	private String input; //����� �Է°�
	private int faultCount; //������� ���� ī����

	public Checker(String input) {
		super();
		this.input = input;
	}

	public boolean check() {
		boolean result = false;
		//������� �Է°��� �迭�� �ϳ����� �˻��غ���..������ true ���� �ϰ� for �����
		for (String str : Gawibawibo.strValues) {
			if (str.equals(input)) {
				return !result;
			}
		}
		//�ùٸ� ���� �ƴϱ⿡ �Ǽ� Ƚ�� ��, ����ڿ��� �˷�����, ��� ������.
		faultCount++;
		showAlert();
		return result;

	}

	/*
	 *	���������� �ƴ� �ٸ� �� �Է½� �˷� �����ְ� ������ 5�� �� ��� ���α׷� ���� ��� ������. 
	 */
	private void showAlert() {
		if (faultCount >= 5) {
			//JOptionPane.showMessageDialog �� ȭ�鿡 �޼����� �����ִ� ��ü�� �޼�����. �ι�° �Ķ���Ͱ� ������
			JOptionPane.showMessageDialog(null, "���� Ƚ���� 5ȸ �Ѿ� ���α׷��� ���� �մϴ�");
			//�Ʒ��ڵ�� ��������� �������� �ڹ� ���α׷��� �����Ű�� �ڵ���.
			System.exit(0);
		}
		JOptionPane.showMessageDialog(null, Gawibawibo.messages[2] + "\n ����Ƚ�� : " + faultCount);
		// check();
	}
	
	//����ڰ� ������������ �߸� �Է��� �� �Է½� setter.
	public void setInput(String input) {
		this.input = input;
	}

}
