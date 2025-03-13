package lantern_of_the_woodlands.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import lantern_of_the_woodlands.block.FlowerOfResurrection7Block;
import lantern_of_the_woodlands.block.FlowerOfResurrection6Block;
import lantern_of_the_woodlands.block.FlowerOfResurrection5Block;
import lantern_of_the_woodlands.block.FlowerOfResurrection4Block;
import lantern_of_the_woodlands.block.FlowerOfResurrection3Block;
import lantern_of_the_woodlands.block.FlowerOfResurrection2Block;
import lantern_of_the_woodlands.block.FlowerOfResurrection1Block;

import lantern_of_the_woodlands.LanternOfTheWoodlandsMod;

import java.util.Map;

public class BasicSpell10randomProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LanternOfTheWoodlandsMod.LOGGER.warn("Failed to load dependency world for procedure BasicSpell10random!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LanternOfTheWoodlandsMod.LOGGER.warn("Failed to load dependency x for procedure BasicSpell10random!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LanternOfTheWoodlandsMod.LOGGER.warn("Failed to load dependency y for procedure BasicSpell10random!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LanternOfTheWoodlandsMod.LOGGER.warn("Failed to load dependency z for procedure BasicSpell10random!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FlowerOfResurrection1Block.block) {
					world.setBlockState(new BlockPos(x, y, z), FlowerOfResurrection2Block.block.getDefaultState(), 3);
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"/playsound minecraft:block.grass.break ambient @a ~ ~ ~ 0.25 2");
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FlowerOfResurrection2Block.block) {
								world.setBlockState(new BlockPos(x, y, z), FlowerOfResurrection3Block.block.getDefaultState(), 3);
								if (world instanceof ServerWorld) {
									((World) world).getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
											"/playsound minecraft:block.grass.break ambient @a ~ ~ ~ 0.25 2");
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;

									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FlowerOfResurrection3Block.block) {
											world.setBlockState(new BlockPos(x, y, z), FlowerOfResurrection4Block.block.getDefaultState(), 3);
											if (world instanceof ServerWorld) {
												((World) world).getServer().getCommandManager().handleCommand(
														new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																(ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(),
																null).withFeedbackDisabled(),
														"/playsound minecraft:block.grass.break ambient @a ~ ~ ~ 0.25 2");
											}
											new Object() {
												private int ticks = 0;
												private float waitTicks;
												private IWorld world;

												public void start(IWorld world, int waitTicks) {
													this.waitTicks = waitTicks;
													MinecraftForge.EVENT_BUS.register(this);
													this.world = world;
												}

												@SubscribeEvent
												public void tick(TickEvent.ServerTickEvent event) {
													if (event.phase == TickEvent.Phase.END) {
														this.ticks += 1;
														if (this.ticks >= this.waitTicks)
															run();
													}
												}

												private void run() {
													if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FlowerOfResurrection4Block.block) {
														world.setBlockState(new BlockPos(x, y, z), FlowerOfResurrection5Block.block.getDefaultState(),
																3);
														if (world instanceof ServerWorld) {
															((World) world).getServer().getCommandManager().handleCommand(
																	new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																			(ServerWorld) world, 4, "", new StringTextComponent(""),
																			((World) world).getServer(), null).withFeedbackDisabled(),
																	"/playsound minecraft:entity.illusioner.cast_spell ambient @a[distance=..100] ~ ~ ~ 2 0 0.025");
														}
														if (world instanceof ServerWorld) {
															((World) world).getServer().getCommandManager()
																	.handleCommand(new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z),
																			Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""),
																			((World) world).getServer(), null).withFeedbackDisabled(),
																			"/spawnpoint @a[tag=wsupport] ~ ~ ~");
														}
														if (world instanceof ServerWorld) {
															((World) world).getServer().getCommandManager().handleCommand(
																	new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																			(ServerWorld) world, 4, "", new StringTextComponent(""),
																			((World) world).getServer(), null).withFeedbackDisabled(),
																	"/particle minecraft:instant_effect ~0.5 ~1 ~0.5 0.25 0.25 0.25 0.01 10 force");
														}
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private IWorld world;

															public void start(IWorld world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																if ((world.getBlockState(new BlockPos(x, y, z)))
																		.getBlock() == FlowerOfResurrection5Block.block) {
																	world.setBlockState(new BlockPos(x, y, z),
																			FlowerOfResurrection6Block.block.getDefaultState(), 3);
																	if (world instanceof ServerWorld) {
																		((World) world).getServer().getCommandManager()
																				.handleCommand(new CommandSource(ICommandSource.DUMMY,
																						new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4,
																						"", new StringTextComponent(
																								""),
																						((World) world).getServer(), null).withFeedbackDisabled(),
																						"/playsound minecraft:block.grass.break ambient @a ~ ~ ~ 0.25 2");
																	}
																	new Object() {
																		private int ticks = 0;
																		private float waitTicks;
																		private IWorld world;

																		public void start(IWorld world, int waitTicks) {
																			this.waitTicks = waitTicks;
																			MinecraftForge.EVENT_BUS.register(this);
																			this.world = world;
																		}

																		@SubscribeEvent
																		public void tick(TickEvent.ServerTickEvent event) {
																			if (event.phase == TickEvent.Phase.END) {
																				this.ticks += 1;
																				if (this.ticks >= this.waitTicks)
																					run();
																			}
																		}

																		private void run() {
																			if ((world.getBlockState(new BlockPos(x, y, z)))
																					.getBlock() == FlowerOfResurrection6Block.block) {
																				world.setBlockState(new BlockPos(x, y, z),
																						FlowerOfResurrection7Block.block.getDefaultState(), 3);
																				if (world instanceof ServerWorld) {
																					((World) world).getServer().getCommandManager()
																							.handleCommand(new CommandSource(ICommandSource.DUMMY,
																									new Vector3d(x, y, z), Vector2f.ZERO,
																									(ServerWorld) world, 4, "",
																									new StringTextComponent(""),
																									((World) world).getServer(), null)
																									.withFeedbackDisabled(),
																									"/playsound minecraft:block.grass.break ambient @a ~ ~ ~ 0.25 2");
																				}
																			}
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 300);
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 300);
													}
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 300);
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 300);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 300);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 300);
	}
}
