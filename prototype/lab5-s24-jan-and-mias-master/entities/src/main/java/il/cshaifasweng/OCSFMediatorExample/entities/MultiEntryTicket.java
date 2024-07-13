package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "MultiEntryTicket")
public class MultiEntryTicket implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int auto_number_multi_entry_ticket;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "auto_number_id_user")
    private IdUser id_user;

    private int remain_tickets;

    public MultiEntryTicket() {}

    public MultiEntryTicket(IdUser id_user, int remain_tickets){
        this.id_user = id_user;
        this.remain_tickets = remain_tickets;
    }

    // get/set methods
    public int get_auto_number_multi_entry_ticket() {
        return auto_number_multi_entry_ticket;
    }

    public IdUser get_id_user(){
        return id_user;
    }
    public void set_id_user(IdUser id_user){
        this.id_user = id_user;
    }
    public int get_remain_tickets() {
        return remain_tickets;
    }
    public void set_remain_tickets(int remain_tickets) {
        this.remain_tickets = remain_tickets;
    }
}
