def read_yaml_file(yaml_file) {
	def datas = ""
	if(yaml_file.toString().endsWith(".yml")){
		datas = readYaml file : yaml_file
		
	}else {
		datas = readYaml text : yaml_file
		
	}
	datas.each {
		println ( it.key + " = " + it.value )
	 }
	
	return datas
}


def write_to_yaml(map_data, yaml_path) {
	writeYaml file: yaml_path , data: map_data
}
