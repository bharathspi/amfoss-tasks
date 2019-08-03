extern crate regex;
use regex::Regex;
fn main() {
    let re=Regex::new(r"^([a-z/d\.-]+)@([a-z/d-]+)\.([a-z]{2,8})(\.[a-z]{2,8})?$").unwrap();
    let t = "bharthr eddyspi@gmial.com";
    if re.is_match(t)==true {
         println!("correct mail");
        
    }else{
        println!("incorrect mail");};
    
}
