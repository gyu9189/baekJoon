package exam;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Gawibawibo {

	// ����� ��ü Ÿ�� �ʵ� ����.
	static private Checker checker;
	static private Gamer gamer;
	static private PlayerInfo user;

	static private String input; // ������� �Է°� ����. ��Ȳ�� ���� ��� ����ؾ� �ϱ� ������ �ʵ�� ����.
	public static String strValues[] = { "����", "����", "��" };
	private static int com;

	// �޼��� ��� �迭 ����.
	public static String[] messages = { "������ ���� �մϴ�.(Y/N)", "���������� �� �ϳ� �Է��ϼ���.", "�Է��� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���.",
			"������ �ٽ� �Ͻðڽ��ϱ�?(Y/N)" };

	public static void main(String[] args) {

		// ����ڿ��� �޼������ �� ���ð� �Է� �޵��� �Ѵ�.
		startMessage();

		// ������� �Է°��� ������ �ʱ�ȭ �Ѵ�. ���� ���� �����ؼ� ������ ���� �б� ��Ų��..�ش� Ŭ���� �м� �غ���.
		checker = new Checker(input);
		while (true) {

			// �� �����Ұ�.
			if (checker.check()) {// �ùٸ� ���� ����ڰ� �־����� ���� �÷���..
				// gamer �����ڿ� ����� �� �־��ְ� �ʱ�ȭ...���� ������-->�ʱ�ȭ�޼���-->�÷��̸޼��� �� ȣ�� ���踦 ���� �ڵ����� ������
				// ����ȴ�.
				gamer = new Gamer(input);

				// ���� ��� get..
				int result = gamer.getGameResult();
				// ��ǻ���� �� get..
				com = gamer.getCom();

				if (user == null) {// ó�� �����÷��̶�� ��ü �ʱ�ȭ ���ְ�..ù �����̱⿡ ��ü ������ �Ѱ�����,
					// ���� ����ø��� ��ü�� �����ϸ� ���� ���� ���� �ϱ� ��ƴ�. �ؼ� ���� ���Ӻ��ʹ� Ref ������ �̿��ؼ� ������ ������Ų��. ������
					// ����.
					// ��ü�� �Ҵ���� �����ÿ� null �� ���ϵȴ�.(�� ����Ұ�)
					user = new PlayerInfo();
					// ���� ������ �ڵ����� setting �ϴ� �޼��� ȣ���Ͽ� ���� set.
					user.autoSet(result);
					// ��� �޼��� ȭ�鿡 �ѷ��ش�. �Ķ������ ������ �ش� �޼��忡 ���� ������ �� ���� �Ѵ�.
					showMessage(result, user, com);
					// ������ ��� �� �� ���θ� Ȯ���Ѵ�.
					// �Ʒ� ���ڿ��� \"Cancel\" �� �ڹ��� escape ���ڷ� �������� ���� t(tab), "(�ֵ���ǥ) ���� ǥ�����ٶ� ����Ѵ�.
					input = JOptionPane.showInputDialog(
							"������ ��� �ϽǷ��� " + Arrays.toString(strValues) + " �� �ϳ���, �������� \"Cancel\" ��������.");
					// ����ڰ� ���ο� ���� �־����� �ٽ� üũ..���� ���� üũ�� �ؾ��Ѵ�.
					checker.setInput(input);
					// ���� ����ڰ� cancel �� ������ null �� ���ϵǹǷ� ���α׷� �����Ų��.
					if (input == null) {
						programExit();
					}
				} else {// �׷��� �ʴٸ� ���� ����ڰ� ��� ������ �ϴ� ���̹Ƿ� setter �� �̿��ؼ� ������ �����Ѵ�.
					user.autoSet(result);
					showMessage(result, user, com);
					input = JOptionPane.showInputDialog(
							"������ ��� �ϽǷ��� " + Arrays.toString(strValues) + " �� �ϳ���, �������� \"Cancel\" ��������.");
					checker.setInput(input);
					if (input == null) {
						programExit();
					}
				}
			} else {// ���������� �� �ƴ� �̻��� �� �־�����..
				input = JOptionPane.showInputDialog(messages[1]);
				// ������� �ٸ����� checker �� �����Ѵ�...�ٽ� ������..
				checker.setInput(input);
			}
		}
	}

	private static void programExit() {
		JOptionPane.showMessageDialog(null, "���α׷��� ���� �մϴ�.", "���α׷� ����", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	// ó�� ���۽� �ʱ� �޼����� �����ְ� ������� ������ �޴´�.
	// y �Ǵ� Y �϶��� �������� ����ǰ�, ������ ���α׷� ����
	private static void startMessage() {
		if (input == null) {
			// ù �޼��� ����� ���� ���� Ȯ���Ѵ�.cancel �� Ŭ���ϸ� null �� ���ϵǰ�, ���� �Է��ϸ� ���ڿ��� ���ϵȴ�.
			input = JOptionPane.showInputDialog(Arrays.toString(strValues) + messages[0]);
			// ��ҹ��� ���о��� ���ڿ� ���� ������ �� �� ���� ���.equals() �� ��ҹ��� ������.
			try {
				if (input.equalsIgnoreCase("y")) {//cancel �� �Է��ߴٰ� �����غ�����..
					// ���������� �� �ϳ� ������� ������ �ٸ����� �־ �����ϵ��� �����ߴ�. �м� �غ�����..
					input = JOptionPane.showInputDialog(messages[1]);	
				}
			} catch (Exception e) {
				input = JOptionPane.showInputDialog("cancel �� �����̳׿�. �����ұ��");
				if(input == null) {
					System.exit(0);
				}
			} 
			if (input.equalsIgnoreCase("n")) {
				// �޼��� �ڽ��� ����ϴ� GUI ȣ��.
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�");
				// �Ʒ� �ڵ�� ��������� ���� �������� �ڹ� ���α׷��� �����ϴ� �ڵ��̴�.
				System.exit(0);

			} else {// Y/N �ƴ� �ٸ� �� ���� ��� ó��..
				JOptionPane.showMessageDialog(null, "������ �� ���� ��ɾ� �Դϴ�. ���α׷� �����մϴ�");
				System.exit(0);
			}
		}
	}

	/*
	 * ���� ��� �����ִ� �޼���.. ���� ������ ����ڰ�ü(PlayerInfo) �� �ֱ� ������ �Ķ���ͷ� �ް�, idx �� ���п� ����
	 * index, comValue �� ��ǻ���� ��.
	 */
	public static void showMessage(int idx, PlayerInfo user, int comValue) {
		if (idx == 0) {
			String msg = "��屺��!! --> �����(" + input + ") : ��ǻ��(" + strValues[comValue] + ")\n" + "���� --> "
					+ user.getTotal() + " : " + user.getWin() + "�� " + user.getDraw() + "�� " + user.getLose() + "��\n"
					+ "�·� --> " + user.getWin_Rate() + "%";

			// JOptionPane.showMessageDialog �� msg �� ������ �˾����� �ѷ��ش�.
			JOptionPane.showMessageDialog(null, msg);
		} else if (idx == 1) {
			String msg = "�̰屺��!! --> �����(" + input + ") : ��ǻ��(" + strValues[comValue] + ")\n" + "���� --> "
					+ user.getTotal() + " : " + user.getWin() + "�� " + user.getDraw() + "�� " + user.getLose() + "��\n"
					+ "�·� --> " + user.getWin_Rate() + "%";

			JOptionPane.showMessageDialog(null, msg);
		} else if (idx == 2) {
			String msg = "������!! --> �����(" + input + ") : ��ǻ��(" + strValues[comValue] + ")\n" + "���� --> "
					+ user.getTotal() + " : " + user.getWin() + "�� " + user.getDraw() + "�� " + user.getLose() + "��\n"
					+ "�·� --> " + user.getWin_Rate() + "%";

			JOptionPane.showMessageDialog(null, msg);
		}
	}
}
