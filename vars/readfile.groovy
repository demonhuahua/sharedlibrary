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
       
	yaml_string = """
                                        age: 18
                                        city: 'Shanghai'
                                        isMale: false
                                        name: 'Lucyyhz'
                                        """
	
	writeFile file:"test.yml", text: yaml_string
	
}
