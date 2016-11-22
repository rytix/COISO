package aaa;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.JOptionPane;

public class aaa {
	static String CAB = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><!--Created with JFLAP 6.4.--><structure>&#13;\r\n" + 
			"	<type>fa</type>&#13;\r\n" + 
			"	<automaton>&#13;\r\n" + 
			"		<!--The list of states.-->&#13;\r\n" + 
			"		<state id=\"0\" name=\"q0\">&#13;\r\n" + 
			"			<x>352.0</x>&#13;\r\n" + 
			"			<y>67.0</y>&#13;\r\n" + 
			"		</state>&#13;\r\n" + 
			"		<state id=\"1\" name=\"q1\">&#13;\r\n" + 
			"			<x>169.0</x>&#13;\r\n" + 
			"			<y>138.0</y>&#13;\r\n" + 
			"		</state>&#13;\r\n" + 
			"		<state id=\"2\" name=\"q2\">&#13;\r\n" + 
			"			<x>520.0</x>&#13;\r\n" + 
			"			<y>122.0</y>&#13;\r\n" + 
			"		</state>&#13;\r\n" + 
			"		<state id=\"3\" name=\"q3\">&#13;\r\n" + 
			"			<x>158.0</x>&#13;\r\n" + 
			"			<y>294.0</y>&#13;\r\n" + 
			"		</state>&#13;\r\n" + 
			"		<state id=\"4\" name=\"q4\">&#13;\r\n" + 
			"			<x>562.0</x>&#13;\r\n" + 
			"			<y>289.0</y>&#13;\r\n" + 
			"		</state>&#13;\r\n" + 
			"		<state id=\"5\" name=\"q5\">&#13;\r\n" + 
			"			<x>287.0</x>&#13;\r\n" + 
			"			<y>410.0</y>&#13;\r\n" + 
			"		</state>&#13;\r\n" + 
			"		<state id=\"6\" name=\"q6\">&#13;\r\n" + 
			"			<x>458.0</x>&#13;\r\n" + 
			"			<y>403.0</y>&#13;\r\n" + 
			"		</state>&#13;\r\n" + 
			"		<!--The list of transitions.-->&#13;";
	static String END = "<note>&#13;\r\n" + 
			"			<text>PLANEJANDO</text>&#13;\r\n" + 
			"			<x>316.0</x>&#13;\r\n" + 
			"			<y>23.0</y>&#13;\r\n" + 
			"		</note>&#13;\r\n" + 
			"		<note>&#13;\r\n" + 
			"			<text>CODIFICANDO</text>&#13;\r\n" + 
			"			<x>53.0</x>&#13;\r\n" + 
			"			<y>130.0</y>&#13;\r\n" + 
			"		</note>&#13;\r\n" + 
			"		<note>&#13;\r\n" + 
			"			<text>EXECUTANDO</text>&#13;\r\n" + 
			"			<x>585.0</x>&#13;\r\n" + 
			"			<y>119.0</y>&#13;\r\n" + 
			"		</note>&#13;\r\n" + 
			"		<note>&#13;\r\n" + 
			"			<text>MUDANDO BLOCOS\r\n" + 
			"AO REDOR DO ROBÔ</text>&#13;\r\n" + 
			"			<x>9.0</x>&#13;\r\n" + 
			"			<y>279.0</y>&#13;\r\n" + 
			"		</note>&#13;\r\n" + 
			"		<note>&#13;\r\n" + 
			"			<text>OBSERVANDO O ROBÔ</text>&#13;\r\n" + 
			"			<x>602.0</x>&#13;\r\n" + 
			"			<y>288.0</y>&#13;\r\n" + 
			"		</note>&#13;\r\n" + 
			"		<note>&#13;\r\n" + 
			"			<text>MUDANDO BLOCOS\r\n" + 
			"LONGE DO ROBÔ</text>&#13;\r\n" + 
			"			<x>148.0</x>&#13;\r\n" + 
			"			<y>437.0</y>&#13;\r\n" + 
			"		</note>&#13;\r\n" + 
			"		<note>&#13;\r\n" + 
			"			<text>OBSERVANDO O MUNDO\r\n" + 
			"DO JOGO LONGE DO ROBÔ</text>&#13;\r\n" + 
			"			<x>492.0</x>&#13;\r\n" + 
			"			<y>423.0</y>&#13;\r\n" + 
			"		</note>&#13;\r\n" + 
			"	</automaton>&#13;\r\n" + 
			"</structure>";
	static int[][] states= {
			{0,1},
			{0,2},
			{0,3},
			{0,4},
			{0,5},
			{0,6},
			{1,0},
			{1,2},
			{1,3},
			{1,4},
			{1,5},
			{1,6},
			{2,0},
			{2,1},
			{2,2},
			{2,3},
			{2,5},
			{2,6},
			{3,0},
			{3,1},
			{3,2},
			{3,4},
			{3,5},
			{3,6},
			{4,0},
			{4,1},
			{4,2},
			{4,3},
			{4,5},
			{4,6},
			{5,0},
			{5,1},
			{5,2},
			{5,3},
			{5,4},
			{5,6},
			{6,0},
			{6,1},
			{6,2},
			{6,3},
			{6,4},
			{6,5}
	};
	private static String createTransition(int o, int d, int weight){
		String transactionA = "<transition>&#13;\r\n" + 
				"			<from>";
		String transactionB = "</from>&#13;\r\n" + 
				"			<to>";
		String transactionC = "</to>&#13;\r\n" + 
				"			<read>";
		String transactionD = "</read>&#13;\r\n" + 
				"		</transition>&#13;\r\n";
		StringBuilder sb = new StringBuilder();
		if(weight == 0){
			return "";
		}
		sb.append(transactionA);
		sb.append(o);
		sb.append(transactionB);
		sb.append(d);
		sb.append(transactionC);
		sb.append(weight);
		sb.append(transactionD);
		return sb.toString();
	}
	public static void main(String[] args) throws Exception {
		for(int out = 1; out <= 1; out++){
			StringBuilder sb = new StringBuilder();
			sb.append(CAB);
			String input = JOptionPane.showInputDialog(out);
			String[] inputs = input.split("[\\s]+");
			if(inputs.length != 42)
				throw new Exception("42 Exception");
			for(int i = 0; i < 42; i++){
				sb.append(createTransition(states[i][0], states[i][1], Integer.parseInt(inputs[i])));
			}
			sb.append(END);
			
			Writer outPut = new BufferedWriter(new OutputStreamWriter(
				    new FileOutputStream("Example.jff"), "UTF-8"));
				try {
					outPut.write(sb.toString());
				} finally {
					outPut.close();
				}
		}
		
	}

}
