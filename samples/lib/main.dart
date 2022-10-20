import 'package:flutter/material.dart';

void main() => runApp(new MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      title: 'Samples',
      home: new Scaffold(
        appBar: new AppBar(
          title: Text('Samples'),
          leading: new Icon(Icons.backspace),
          actions: <Widget>[
            new IconButton(
              icon: new Icon(Icons.phone),
              onPressed: () => {},
              tooltip: 'Call',
            ),
            new IconButton(
                icon: new Icon(Icons.pie_chart),
                tooltip: 'Analysis',
                onPressed: () => {})
          ],
        ),
        bottomNavigationBar: new BottomNavigationBar(items: [
          new BottomNavigationBarItem(
              icon: new Icon(Icons.account_balance), title: new Text("Bank")),
          new BottomNavigationBarItem(
              icon: new Icon(Icons.shop), title: new Text('shop')),
          new BottomNavigationBarItem(
              icon: new Icon(Icons.apps), title: new Text('Apps'))
        ]),
        body: new Container(
          padding: EdgeInsets.all(20.0),
          child: new Column(
            children: <Widget>[
              Text('Hello Universe'),
              new TextField(
                decoration: new InputDecoration(
                  border: InputBorder.none,
                  hintText: 'please enter here',
                ),
              ),
              Row(
                children: <Widget>[
                  Column(
                    children: <Widget>[
                      new Checkbox(
                        value: true,
                        onChanged: (bool value) {},
                      ),
                      new Radio<int>(
                          value: 0, groupValue: 0, onChanged: (_) {}),
                      new Switch(value: false, onChanged: (bool value) {}),
                    ],
                  ),
                  new ButtonBar(
                    mainAxisSize: MainAxisSize.min,
                    children: <Widget>[
                      new FlatButton(
                          child: const Text('Flat Button'), onPressed: () {}),
                    ],
                  ),
                ],
              ),
              Image.network(
                  'https://media2.giphy.com/media/10hFk8eK2Grx60/giphy.gif')
            ],
          ),
        ),
      ),
    );
  }
}
