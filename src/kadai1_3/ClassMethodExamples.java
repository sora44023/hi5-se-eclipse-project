package kadai1_3;

import java.time.LocalDateTime;
import java.io.File;

public class ClassMethodExamples {
	public static void main(String[] args) {
        // (1)Math��max���\�b�h
        // 2�̈����̐��l�̂����傫������Ԃ��D
        int a = 2;
        int b = 3;
        System.out.println("--- (1) ---");
        System.out.println(Math.max(a, b));	// 3���o�͂����
        
        // (2)LocalDateTime��now���\�b�h
        // ���݂̓��t�E���Ԃ��擾
        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println("\n--- (2) ---");
        System.out.println(nowDate);	// ���s���̓��t�E���Ԃ��o�͂����
        
        // (3)File��list���\�b�h
        // �w�肵���f�B���N�g���̈ꗗ�𓾂�
        File dir = new File("/Users");	// Users�f�B���N�g�����w��
        String[] dirlist = dir.list();	// �w�肵���f�B���N�g���̈ꗗ��String�^�̔z��Ɋi�[
        System.out.println("\n--- (3) ---");
        for(int i=0; i<dirlist.length; i++) {
        	System.out.println(dirlist[i]);	// �z��Ɋi�[���ꂽ�t�@�C�������o�͂����
        }
        
	}
}
