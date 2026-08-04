// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
//fuck java model!


public class millstone<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "millstone"), "main");
	private final ModelPart mopan;
	private final ModelPart shidun;

	public millstone(ModelPart root) {
		this.mopan = root.getChild("mopan");
		this.shidun = root.getChild("shidun");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mopan = partdefinition.addOrReplaceChild("mopan", CubeListBuilder.create().texOffs(0, 0).addBox(-23.0F, -6.0F, -7.0F, 30.0F, 6.0F, 30.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-17.0F, 0.0F, -1.0F, 18.0F, 9.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(72, 36).addBox(-21.0F, -7.0F, -7.0F, 28.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 63).addBox(-23.0F, -7.0F, -7.0F, 2.0F, 1.0F, 28.0F, new CubeDeformation(0.0F))
		.texOffs(60, 63).addBox(5.0F, -7.0F, -5.0F, 2.0F, 1.0F, 28.0F, new CubeDeformation(0.0F))
		.texOffs(72, 39).addBox(-23.0F, -7.0F, 21.0F, 28.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 15.0F, -8.0F));

		PartDefinition shidun = partdefinition.addOrReplaceChild("shidun", CubeListBuilder.create().texOffs(72, 42).addBox(-11.0F, -5.0F, -3.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(72, 58).addBox(-20.0F, -2.0F, 0.0F, 20.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 6.0F, -1.0F));

		PartDefinition cube_r1 = shidun.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 92).addBox(-3.0F, -9.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mopan.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shidun.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}