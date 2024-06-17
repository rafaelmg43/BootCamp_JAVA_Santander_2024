package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.ConhecendoCollections.EMAP.COrdenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.Map.Entry;

public class AgendaEventos {

    //Atributo

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void dicionarEvento(LocalDate data, String nome, String atracao){
       // Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public  void exibirAgenda(){
        Map<LocalDate ,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        //Set<LocalDate> dateSet = eventosMap.keySet();
        //Collection<Evento> values =  eventosMap.values();
        //eventosMap.get() nao sabemos a key por isso nao serve

        LocalDate dataAtual =  LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate ,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento =  entry.getValue();
                System.out.println("O proximo Evento " + proximoEvento + " Acontecera na data " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.dicionarEvento(LocalDate.of(2024, Month.JUNE, 16),"Evento 1", "Atracao 1");
        agendaEventos.dicionarEvento(LocalDate.of(2024, Month.AUGUST, 9),"Evento 2", "Atracao 2");
        agendaEventos.dicionarEvento(LocalDate.of(2022, Month.APRIL, 10),"Evento 3", "Atracao 3");
        agendaEventos.dicionarEvento(LocalDate.of(2026, Month.APRIL, 11),"Evento 4", "Atracao 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }


}
