function pincode(pincodes){
    try{
const pincode_condition = /^[1-9][0-9]{5}$/;
if (!pincode_condition.test(pincodes)) {
    throw new Error ("invalid pincode");
}else{
    console.log("valid pincode");
}}
catch(err){
    console.log(err.message);
}
}
// pincode(638111);
 pincode(A400088);