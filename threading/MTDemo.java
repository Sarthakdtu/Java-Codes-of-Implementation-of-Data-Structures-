package threading;
	import java.awt.Font;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JTextField;

	public class MTDemo extends JFrame implements ActionListener {
		JTextField textNormal, textMT, textTest;
		JButton btnNormal, btnMT, btnTest;

		public MTDemo() {
			super.setTitle("Multithreading Demo");
			super.setSize(800, 800);

			GridLayout grid = new GridLayout(2, 3);
			super.setLayout(grid);

			Font font = new Font("Comic Sans", 1, 50);

			textNormal = new JTextField();
			textNormal.setFont(font);
			super.add(textNormal);

			textMT = new JTextField();
			textMT.setFont(font);
			super.add(textMT);

			textTest = new JTextField();
			textTest.setFont(font);
			super.add(textTest);

			btnNormal = new JButton("Normal");
			btnNormal.setFont(font);
			btnNormal.addActionListener(this);
			super.add(btnNormal);

			btnMT = new JButton("MT");
			btnMT.setFont(font);
			btnMT.addActionListener(this);
			super.add(btnMT);

			btnTest = new JButton("Test");
			btnTest.setFont(font);
			btnTest.addActionListener(this);
			super.add(btnTest);

			// super.setResizable(false);
			super.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			int n = 45;

			if (e.getSource() == btnNormal) {
//				Lecture9.ComplexityDemos.startAlgo();
//				Lecture21.DPDemos.fib(n);
				//textNormal.setText(Lecture9.ComplexityDemos.endAlgo() + "");
			} else if (e.getSource() == btnMT) {
				Runnable taskToRun = new Runnable() {

					@Override
					public void run() {
//						Lecture9.ComplexityDemos.startAlgo();
//						Lecture21.DPDemos.fib(n);

	                  //	textMT.setText(Lecture9.ComplexityDemos.endAlgo() + "");
					}
				};

				Thread thd = new Thread(taskToRun);
				thd.start();
			} else if (e.getSource() == btnTest) {
				if (textTest.getText().length() == 0) {
					textTest.setText("Hello");
				} else {
					textTest.setText("");
				}
			}

		}

	}


