class Television extends Seihin{
	public int tvSerialNumber;
	public String date;

	public void numberring(){
		tvSerialNumber = Counter.getTvNumber();	//テレビの製品番号を取得
	}

	public void setDate(String date){
		this.date = date;
	}

	public void print(){
		System.out.println("このテレビに関する情報");
		System.out.println("製造番号：" + tvSerialNumber);
		System.out.println("製造年月日：" + date);
	}
}

