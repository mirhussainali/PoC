USE [pocdb]
GO

/****** Object:  Table [dbo].[PurchaseOrder]    Script Date: 1/23/2022 11:26:51 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[PurchaseOrder](
	[orderID] [varchar](50) NOT NULL,
	[payload] [varchar](max) NOT NULL,
	[orderTotal] [float] NOT NULL,
	[dateCreated] [datetime] NOT NULL,
	[customerName] [varchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[orderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO


