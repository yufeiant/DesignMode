package com.feiyu.FactoryModel;

import java.util.Scanner;
/**
 * �򵥹���ģʽ��
 * ������ǰ��ӡ���У�����ģʽһֱ���������ظ���ȥ�������󣬺ðɣ��Ҵ��ˣ�ԭ������ģʽ�������ӵ�
 * 
 * �����������ģʽʵ�ֵ���Ŀ��ʵ��һ������������̨����Ҫ��������������������ţ��õ���������
 * �ڴ�ͳ��������̱���У����ǻ�ֱ����main�����н��м��㣬ͨ��switch�ж�������������ŵ��жϣ�
 * Ȼ�����ļ�������Ҳ��д��������'+','-','*','/',ֱ���ڽ�����������������ͻἸ������
 * һ������ͼ����߼���һ����ϸ�
 * ���������߼�д�����ɸ��ò�
 * ������������ һ�����������㣬��Ҫ�������м�����ı��룬����չ�Բ�
 * 
 * ����ģʽ��ʹ�þ���Ϊ�˽����������⣬ʵ�ֹ���ģʽ�Ĺ��̣��������Լ�˼���Ĺ��̣�ԭ���������Ը���
 * һ���Ѽ�������г�������㸸�࣬Operation�����еļ����඼�̳��ڴ��࣬�Ժ���������ӱ�������࣬
 * ֻ��Ҫ�̳���
 * ����ÿһ�����㷽ʽ�Ĳ�ͬ�����̳�Operation��ȥʵ���Լ���ʵ�֣��Ժ��������޸ļӷ��ֻ࣬��Ҫ�޸ļ�
 * �����ʵ�־Ϳ�����
 * ����ͨ��һ�������࣬ͨ������Ĳ�ͬ��������ţ����ж���Ҫʵ�����ĸ��࣬��Ҫ�ĸ����Ҿ͸���ʵ�����ĸ���
 * Ȼ�󷵻ء�
 * 
 *ʹ�ó�������������Ҫnew�ܶ����ʱ�����Կ��ǣ����԰棬�Ժ���в��䣩
 * http://baike.so.com/doc/6777948-6993946.html
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ���е����㣡");
		String operate = scanner.nextLine();
		System.out.println("�������һ�����֣�");
		double numberA = scanner.nextInt();
		System.out.println("������ڶ������֣�");
		double numberB = scanner.nextInt();
		
		Operation operation = OperationFactory.getOperation(operate);
		operation.setNumberA(numberA);
		operation.setNumberB(numberB);
		System.out.println("������Ϊ��"+operation.GetResult());
	}
}
