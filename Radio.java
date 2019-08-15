class Radio extends Seihin{
	private int radioSerialNumber;

	public void numberring(){
		radioSerialNumber = Counter.getRadioNumber();	//ラジオの製品番号を取得
	}
	public void print(){
		System.out.println("このラジオに関する情報：");
		System.out.println("製造番号：" + radioSerialNumber);
	}
}
