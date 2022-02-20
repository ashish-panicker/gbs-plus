export class Item {

    id:number
    name:string 
    description:string 
    price:number 
    category:string 
    type:string 
    image:string 

    constructor(id:number, name:string, description:string, price:number, category:string, type:string, image:string) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.type = type;
        this.image = image;
    }
}
