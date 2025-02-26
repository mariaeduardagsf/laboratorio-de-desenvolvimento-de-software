import { AppDataSource } from './data-source';
import express from 'express';
import userRoutes from './Router/UserRouter';
import accountRoutes from './Router/AccountRouter';
import enterpriseRoutes from './Router/EnterpriseRouter';
import studentRoutes from './Router/StudentRouter';
import advantageRoutes from './Router/AdvantageRouter';
import cors from 'cors';
const app = express();

AppDataSource.initialize()
	.then(async () => {
		app.use(cors('*'));
		app.use(express.json());
		app.use('/users', userRoutes);
		app.use('/accounts', accountRoutes);
		app.use('/enterprise', enterpriseRoutes);
		app.use('/student', studentRoutes);
		app.use('/advantage', advantageRoutes);
		app.listen(3000, () => {
			console.log('Server is running on port 3000');
		});
		console.log('Connected to the database');
	})
	.catch((error) => console.log(error));
