class Badge {
    public String print(Integer id, String name, String department) {
        if(id == null && department != null)
            return name+" - "+department.toUpperCase();
        else if (id == null)
            return name+" - OWNER";
        else if (department == null)
            return "["+id+"] "+"- "+name+" - OWNER";
        
        return "["+id+"] "+"- "+name+" - "+department.toUpperCase();
    }
}
