# 🎙️ Cenaflix-CAST (Sistema de Cadastro de Podcasts)

## Status do Projeto
**Em desenvolvimento**

---

## 💡 Sobre o Projeto
Este projeto foi desenvolvido como **atividade prática** para o curso de **Análise e Desenvolvimento de Sistemas** do SENAC.

Trata-se de um sistema simples para **cadastro e gerenciamento de episódios de podcast**, com foco em **autenticação de usuários** e **níveis de acesso**.

### Funcionalidades e Requisitos
O sistema implementa os seguintes requisitos da atividade:

* **Autenticação e Segurança:** Tela de Login que autentica usuários, buscando dados no banco.
* **Níveis de Acesso:** Implementação de 3 níveis de usuários (**Administrador**, **Operador** e **Usuário**), onde algumas funcionalidades (como o botão Cadastrar) são **restritas** para usuários de nível mais baixo.
* **Listagem Completa:** Tela de listagem que exibe todos os podcasts cadastrados.
* **Busca Dinâmica:** Campo de busca que filtra a lista de podcasts **por Produtor**.
* **Cadastro Detalhado:** Tela de cadastro para preenchimento dos seguintes campos: **Produtor**, **Nome do Episódio**, **Número do Episódio**, **Duração** e **URL do Repositório**.
* **Navegação:** Botão de **Ver Listagem** na tela de cadastro para retornar ao *dashboard*.

---

## 🛠️ Tecnologias e Arquitetura

| Tecnologia/Padrão | Finalidade |
| :--- | :--- |
| **Java** | Linguagem de programação (Utilizando a IDE NetBeans). |
| **MySQL (Workbench)** | Banco de dados relacional para persistência de dados. |
| **Java Swing** | Utilizado para a criação das telas da interface gráfica (GUI). |
| **Padrão MVC** | Arquitetura utilizada para separar o Modelo (dados), Visão (telas) e Controlador (lógica). |
| **JPA (Java Persistence API)** | Framework de persistência de dados, utilizado para gerenciar a conexão com o banco. |
| **Maven** | Gerenciador de dependências e automação de *build*. |

---

## 🧑‍💻 Desenvolvedor
**Eduardo Moreno Pereira**
