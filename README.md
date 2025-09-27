🎙️ Cenacast (Sistema de Cadastro de Podcasts)
Status do Projeto
Em desenvolvimento

💡 Sobre o Projeto
Este sistema foi desenvolvido como atividade prática para o curso de Análise e Desenvolvimento de Sistemas do SENAC. O objetivo é criar uma plataforma robusta para o gerenciamento e cadastro de episódios de podcasts, utilizando conceitos de segurança (login/níveis de acesso) e arquitetura de software (MVC/JPA).

🔑 Autenticação e Níveis de Acesso
O sistema possui uma tela de Login que autentica os usuários no banco de dados, controlando o acesso com base em três níveis de permissão:

Nível de Usuário	Restrições e Permissões
Administrador	Acesso total a todas as funcionalidades.
Operador	Permissões de gerenciamento limitadas (Ex: Cadastro e edição).
Usuário Comum	Acesso restrito apenas à visualização (botão de cadastro oculto).

Exportar para as Planilhas
✨ Funcionalidades Principais
Após o login, o sistema permite:

Listagem de Podcasts: Tela principal que exibe todos os episódios cadastrados.

Busca Dinâmica: Campo de busca que filtra os resultados da listagem em tempo real com base no Produtor.

Cadastro de Episódios:

Acesso restrito por nível de usuário.

Campos: Produtor, Nome do Episódio, Número do Episódio, Duração e URL do Repositório.

Botões para confirmar o cadastro e voltar para a tela de listagem.

🛠️ Stack Tecnológica e Arquitetura
Este projeto foi construído focando na aplicação de padrões de mercado.

Categoria	Tecnologia	Detalhes Técnicos
Linguagem/Interface	Java (NetBeans)	Utilização de Java Swing para a criação das telas de interface (GUI).
Arquitetura	Padrão MVC	Separação clara entre Modelo, Visão e Controlador.
Persistência (BD)	MySQL Workbench	Banco de dados relacional para persistência de dados.
Conexão Avançada	JPA (Java Persistence API)	Uso de JPA para mapeamento objeto-relacional (ORM), substituindo o JDBC direto.
Gerenciamento	Maven	Gerenciador de dependências e automação de build do projeto.

Exportar para as Planilhas
🧑‍💻 Desenvolvedor
Eduardo Moreno Pereira
