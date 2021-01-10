def read_yaml_file(yaml_file) {
	def datas = ""
	if(yaml_file.toString().endsWith(".yml")){
		datas = readYaml file : yaml_file
		
	}else {
		datas = readYaml text : yaml_file
		writeYaml file: test.yml , data: datas
	}
	datas.each {
		println ( it.key + " = " + it.value )
	 }
	
}
