<script type="text/javascript">
    function phoneno(){
        var x=document.getElementById('mobile').value;
        if(x==" "){
            document.getElementById("messages").innerHTML="Please fill Mobile Number";
            return false;
        }
        if(isNaN(x)){
            document.getElementById("messages").innerHTML="Enter only Numeric Value";
            return flase;
        }
        if(x.length<10){
            document.getElementById("messages").innerHTML="Mobile Number must be 10 digits";
            return flase;
        }
        if(x.length>10){
            document.getElementById("messages").innerHTML="Mobile Number must be 10 digits";
            return flase;
        }



    }

</script>