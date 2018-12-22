import UIKit
import common

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let user = User(id: 100, name: "AAkira", email: "hoge@gmail.com")
        
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        label.text = user.name
        view.addSubview(label)
    }
}
