fn greet_world() {
    println!("Hello, world!");
    let southern_germany = "Gruss Gott!";
    let english = "Hello, world!";
    let regions = [southern_germany, english];

    for region in regions.iter() {
        println!("{}", &region);
    }
}

fn main() {
    greet_world();
}
