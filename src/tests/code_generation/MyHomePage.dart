class MyHomePage extends StatefulWidget {
  State<MyHomePage> createState() => MyHomePageState();
}
class MyHomePageState extends State<MyHomePage> {

  Widget build(BuildContext context) {
  return Scaffold(
  body: Padding(
        padding: EdgeInsets.all(8),
        child: Row(
            children: [
              Expanded(
                child: Column(
                  children: [
                    Container(
                      height: 300,
                      child: Column(
                        children:  [
                          Text("Hi"),
                          Expanded(child: Image.network("../../images/test_image.jpg"))
                        ],
                      ),
                    )],
                ),
              ),
              Expanded(
                child: Column(
                  children: [
                    Expanded(
                      child:Container(
                        height: 200,
                        child: MaterialButton(
                        onPressed:(){
                            Get.to(Second,"../../images/test_image2.jpg");
                         },
                          child: Column(
                            children:  [
                              Text("Test 1"),
                              Expanded(child: Image.network("../../images/test_image2.jpg"))
                            ],
                          ),
                        ),
                      ) ,
                    ) ,
                    Expanded(
                      child:Container(
                        width: 200,

                        height: 200,
                        child: MaterialButton(
                        onPressed:(){
                           Get.to(Second,"../../images/test_image3.jpg");

                        },

                          child: Column(
                            children:  [
                              Text("Test 2"),
                              Expanded(child: Image.network("../../images/test_image3.jpg"))
                            ],
                          ),
                        ),
                      ) ,
                    ) ,
                    Expanded(
                      child:Container(
                        width: 200,

                        height: 200,
                        child: MaterialButton(
                       onPressed:(){
                            Get.to(Second,"../../images/test_image.jpg");

                        },
                          child: Column(
                            children:  [
                              Text("Test 3"),
                              Expanded(child: Image.network("../../images/test_image.jpg"))
                            ],
                          ),
                        ),
                      ) ,
                    ) ,
                    Expanded(
                      child:Container(
                        width: 200,

                        height: 200,
                        child: MaterialButton(
                        onPressed:(){
                            Get.to(Second,"../../images/test_image2.jpg");

                                                },

                          child: Column(
                            children:  [
                              Text("Test 4"),
                              Expanded(child: Image.network("../../images/test_image2.jpg"))
                            ],
                          ),
                        ),
                      ) ,
                    ) ,
                  ],
                ),
              ),
            ],
          ),
      ),
  );
  }

}


