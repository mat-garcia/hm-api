package com.matdev.hmapi.entity.reserva;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "reservas", schema = "\"CPH\"")
public class ReservaDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private Integer id_empreendimento;
    @Column
    private String localizadorchannel;
    @Column
    private LocalDateTime datahorachegada;
    @Column
    private LocalDateTime datahorapartida;
    @Column
    private Integer id_pessoareserva;
    @Column
    private Integer id_agenciaoperadora;
    @Column
    private LocalDateTime datahorainclusao;
    @Column
    private LocalDate deadline;
    @Column
    private String nomegrupo;
    @Column
    private Integer qtdadl;
    @Column
    private Integer qtdcri1;
    @Column
    private Integer qtdcri2;
    @Column
    private Integer qtdcri3;
    @Column
    private String contato;
    @Column
    private String contatoemail;
    @Column
    private String contatofone;
    @Column
    private String obs_interna;
    @Column
    private Integer id_statusreserva;
    @Column
    private Long numeroreserva;
    @Column
    private Boolean noshow;
    @Column
    private Integer organizador;
    @Column
    private LocalDateTime datahorachegadaprevista;
    @Column
    private LocalDateTime datahorapartidaprevista;
    @Column
    private Integer contato_id_tipodedoc;
    @Column
    private String contatodoc;
    @Column
    private Boolean contato_hospedeprincipal;
    @Column
    private Long id_origemreserva;
    @Column
    private Long id_segmentoreserva;
    @Column
    private LocalDateTime datahoracancelamento;
    @Column
    private Integer id_justificativacancelamento;
    @Column
    private Integer id_usuariocancelamento;
    @Column
    private String localizadorota;
    @Column
    private String obs_governanca;
    @Column
    private Integer id_usuarioinclusao;
    @Column
    private Boolean cobrar_txturismo = true;
    @Column
    private String obs_voucher;
    @Column
    private Long id_reservagrupo;
    @Column
    private Boolean early_checkin = false;
    @Column
    private Boolean late_checkout = false;
    @Column
    private Boolean cobrar_txservico;
    @Column
    private Boolean cobrar_impmunicipal;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getId_empreendimento() {
        return id_empreendimento;
    }

    public void setId_empreendimento(Integer id_empreendimento) {
        this.id_empreendimento = id_empreendimento;
    }

    public String getLocalizadorchannel() {
        return localizadorchannel;
    }

    public void setLocalizadorchannel(String localizadorchannel) {
        this.localizadorchannel = localizadorchannel;
    }

    public LocalDateTime getDatahorachegada() {
        return datahorachegada;
    }

    public void setDatahorachegada(LocalDateTime datahorachegada) {
        this.datahorachegada = datahorachegada;
    }

    public LocalDateTime getDatahorapartida() {
        return datahorapartida;
    }

    public void setDatahorapartida(LocalDateTime datahorapartida) {
        this.datahorapartida = datahorapartida;
    }

    public Integer getId_pessoareserva() {
        return id_pessoareserva;
    }

    public void setId_pessoareserva(Integer id_pessoareserva) {
        this.id_pessoareserva = id_pessoareserva;
    }

    public Integer getId_agenciaoperadora() {
        return id_agenciaoperadora;
    }

    public void setId_agenciaoperadora(Integer id_agenciaoperadora) {
        this.id_agenciaoperadora = id_agenciaoperadora;
    }

    public LocalDateTime getDatahorainclusao() {
        return datahorainclusao;
    }

    public void setDatahorainclusao(LocalDateTime datahorainclusao) {
        this.datahorainclusao = datahorainclusao;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getNomegrupo() {
        return nomegrupo;
    }

    public void setNomegrupo(String nomegrupo) {
        this.nomegrupo = nomegrupo;
    }

    public Integer getQtdadl() {
        return qtdadl;
    }

    public void setQtdadl(Integer qtdadl) {
        this.qtdadl = qtdadl;
    }

    public Integer getQtdcri1() {
        return qtdcri1;
    }

    public void setQtdcri1(Integer qtdcri1) {
        this.qtdcri1 = qtdcri1;
    }

    public Integer getQtdcri2() {
        return qtdcri2;
    }

    public void setQtdcri2(Integer qtdcri2) {
        this.qtdcri2 = qtdcri2;
    }

    public Integer getQtdcri3() {
        return qtdcri3;
    }

    public void setQtdcri3(Integer qtdcri3) {
        this.qtdcri3 = qtdcri3;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getContatoemail() {
        return contatoemail;
    }

    public void setContatoemail(String contatoemail) {
        this.contatoemail = contatoemail;
    }

    public String getContatofone() {
        return contatofone;
    }

    public void setContatofone(String contatofone) {
        this.contatofone = contatofone;
    }

    public String getObs_interna() {
        return obs_interna;
    }

    public void setObs_interna(String obs_interna) {
        this.obs_interna = obs_interna;
    }

    public Integer getId_statusreserva() {
        return id_statusreserva;
    }

    public void setId_statusreserva(Integer id_statusreserva) {
        this.id_statusreserva = id_statusreserva;
    }

    public Long getNumeroreserva() {
        return numeroreserva;
    }

    public void setNumeroreserva(Long numeroreserva) {
        this.numeroreserva = numeroreserva;
    }

    public Boolean getNoshow() {
        return noshow;
    }

    public void setNoshow(Boolean noshow) {
        this.noshow = noshow;
    }

    public Integer getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Integer organizador) {
        this.organizador = organizador;
    }

    public LocalDateTime getDatahorachegadaprevista() {
        return datahorachegadaprevista;
    }

    public void setDatahorachegadaprevista(LocalDateTime datahorachegadaprevista) {
        this.datahorachegadaprevista = datahorachegadaprevista;
    }

    public LocalDateTime getDatahorapartidaprevista() {
        return datahorapartidaprevista;
    }

    public void setDatahorapartidaprevista(LocalDateTime datahorapartidaprevista) {
        this.datahorapartidaprevista = datahorapartidaprevista;
    }

    public Integer getContato_id_tipodedoc() {
        return contato_id_tipodedoc;
    }

    public void setContato_id_tipodedoc(Integer contato_id_tipodedoc) {
        this.contato_id_tipodedoc = contato_id_tipodedoc;
    }

    public String getContatodoc() {
        return contatodoc;
    }

    public void setContatodoc(String contatodoc) {
        this.contatodoc = contatodoc;
    }

    public Boolean getContato_hospedeprincipal() {
        return contato_hospedeprincipal;
    }

    public void setContato_hospedeprincipal(Boolean contato_hospedeprincipal) {
        this.contato_hospedeprincipal = contato_hospedeprincipal;
    }

    public Long getId_origemreserva() {
        return id_origemreserva;
    }

    public void setId_origemreserva(Long id_origemreserva) {
        this.id_origemreserva = id_origemreserva;
    }

    public Long getId_segmentoreserva() {
        return id_segmentoreserva;
    }

    public void setId_segmentoreserva(Long id_segmentoreserva) {
        this.id_segmentoreserva = id_segmentoreserva;
    }

    public LocalDateTime getDatahoracancelamento() {
        return datahoracancelamento;
    }

    public void setDatahoracancelamento(LocalDateTime datahoracancelamento) {
        this.datahoracancelamento = datahoracancelamento;
    }

    public Integer getId_justificativacancelamento() {
        return id_justificativacancelamento;
    }

    public void setId_justificativacancelamento(Integer id_justificativacancelamento) {
        this.id_justificativacancelamento = id_justificativacancelamento;
    }

    public Integer getId_usuariocancelamento() {
        return id_usuariocancelamento;
    }

    public void setId_usuariocancelamento(Integer id_usuariocancelamento) {
        this.id_usuariocancelamento = id_usuariocancelamento;
    }

    public String getLocalizadorota() {
        return localizadorota;
    }

    public void setLocalizadorota(String localizadorota) {
        this.localizadorota = localizadorota;
    }

    public String getObs_governanca() {
        return obs_governanca;
    }

    public void setObs_governanca(String obs_governanca) {
        this.obs_governanca = obs_governanca;
    }

    public Integer getId_usuarioinclusao() {
        return id_usuarioinclusao;
    }

    public void setId_usuarioinclusao(Integer id_usuarioinclusao) {
        this.id_usuarioinclusao = id_usuarioinclusao;
    }

    public Boolean getCobrar_txturismo() {
        return cobrar_txturismo;
    }

    public void setCobrar_txturismo(Boolean cobrar_txturismo) {
        this.cobrar_txturismo = cobrar_txturismo;
    }

    public String getObs_voucher() {
        return obs_voucher;
    }

    public void setObs_voucher(String obs_voucher) {
        this.obs_voucher = obs_voucher;
    }

    public Long getId_reservagrupo() {
        return id_reservagrupo;
    }

    public void setId_reservagrupo(Long id_reservagrupo) {
        this.id_reservagrupo = id_reservagrupo;
    }

    public Boolean getEarly_checkin() {
        return early_checkin;
    }

    public void setEarly_checkin(Boolean early_checkin) {
        this.early_checkin = early_checkin;
    }

    public Boolean getLate_checkout() {
        return late_checkout;
    }

    public void setLate_checkout(Boolean late_checkout) {
        this.late_checkout = late_checkout;
    }

    public Boolean getCobrar_txservico() {
        return cobrar_txservico;
    }

    public void setCobrar_txservico(Boolean cobrar_txservico) {
        this.cobrar_txservico = cobrar_txservico;
    }

    public Boolean getCobrar_impmunicipal() {
        return cobrar_impmunicipal;
    }

    public void setCobrar_impmunicipal(Boolean cobrar_impmunicipal) {
        this.cobrar_impmunicipal = cobrar_impmunicipal;
    }
}

