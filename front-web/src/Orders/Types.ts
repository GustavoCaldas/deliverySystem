export type Product = {
    id: number;
    name: string;
    price: number;
    description: string;
    imageUri: string;
}

export type OrderLocationData = {
    latitude: number;
    longitude: number;
    address: string;
}

export type ProductId = {
    id : number;
}

export type OrderPayLoad = {
    latitude: number;
    longitude: number;
    address: string;
    products: ProductId[];
}