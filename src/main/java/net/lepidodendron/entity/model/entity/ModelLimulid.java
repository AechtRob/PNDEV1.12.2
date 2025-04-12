package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraLimulid;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelLimulid extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer front;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legbase;
    private final AdvancedModelRenderer pedipalpR;
    private final AdvancedModelRenderer pedipalpL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer gills;
    private final AdvancedModelRenderer gill1;
    private final AdvancedModelRenderer gill2;
    private final AdvancedModelRenderer gill3;
    private final AdvancedModelRenderer gill4;
    private final AdvancedModelRenderer gill5;
    private final AdvancedModelRenderer gill6;
    private final AdvancedModelRenderer part;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer part2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail;

    public ModelLimulid() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 23.25F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 0, -4.5F, -3.25F, -6.0F, 9, 1, 8, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 11, 0.0F, -3.75F, -6.0F, 0, 1, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.5F, -3.25F, -2.0F);
        this.carapace.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.6981F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, 0.5F, 0.0F, -4.0F, 1, 0, 8, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, -0.5F, 0.0F, -4.0F, 1, 0, 8, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.5F, -3.25F, -2.0F);
        this.carapace.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.8727F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, -4.0F, 0.0F, -4.0F, 4, 0, 10, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, -1, 32, -1.0F, -0.01F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(4.5F, -3.25F, -2.0F);
        this.carapace.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.6981F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 9, -0.5F, 0.0F, -4.0F, 1, 0, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.5F, -3.25F, -2.0F);
        this.carapace.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.8727F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, -1, 32, 0.0F, -0.01F, 0.0F, 1, 0, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 9, 0.0F, 0.0F, -4.0F, 4, 0, 10, 0.0F, false));

        this.front = new AdvancedModelRenderer(this);
        this.front.setRotationPoint(0.0F, -3.25F, -6.0F);
        this.carapace.addChild(front);
        this.setRotateAngle(front, 0.8727F, 0.0F, 0.0F);
        this.front.cubeList.add(new ModelBox(front, 16, 9, -4.5F, 0.0F, -4.0F, 9, 0, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.front.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 2.0944F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 13, -4.5F, 0.0F, -3.0F, 9, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.5F, 0.0F, -2.0F);
        this.front.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.7418F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 26, -3.0F, 0.0F, -1.75F, 3, 0, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(4.5F, 0.0F, -2.0F);
        this.front.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.7418F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 26, 0.0F, 0.0F, -1.75F, 3, 0, 4, 0.0F, false));

        this.legbase = new AdvancedModelRenderer(this);
        this.legbase.setRotationPoint(-1.0F, -2.25F, -3.5F);
        this.carapace.addChild(legbase);


        this.pedipalpR = new AdvancedModelRenderer(this);
        this.pedipalpR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legbase.addChild(pedipalpR);
        this.setRotateAngle(pedipalpR, 0.48F, 0.2618F, -0.0873F);
        this.pedipalpR.cubeList.add(new ModelBox(pedipalpR, 0, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.pedipalpL = new AdvancedModelRenderer(this);
        this.pedipalpL.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.legbase.addChild(pedipalpL);
        this.setRotateAngle(pedipalpL, 0.48F, -0.2618F, 0.0873F);
        this.pedipalpL.cubeList.add(new ModelBox(pedipalpL, 0, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.legbase.addChild(legR);
        this.setRotateAngle(legR, -1.2217F, 0.1309F, -1.1781F);
        this.legR.cubeList.add(new ModelBox(legR, 16, 26, -4.0F, 0.0F, -3.5F, 4, 0, 4, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.legbase.addChild(legL);
        this.setRotateAngle(legL, -1.2217F, -0.1309F, 1.1781F);
        this.legL.cubeList.add(new ModelBox(legL, 16, 26, 0.0F, 0.0F, -3.5F, 4, 0, 4, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(0.5F, 0.0F, 1.25F);
        this.legbase.addChild(legR2);
        this.setRotateAngle(legR2, -0.829F, 0.2618F, -0.7854F);
        this.legR2.cubeList.add(new ModelBox(legR2, 13, 21, -5.0F, 0.0F, -3.5F, 5, 0, 4, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.5F, 0.0F, 1.25F);
        this.legbase.addChild(legL2);
        this.setRotateAngle(legL2, -0.829F, -0.2618F, 0.7854F);
        this.legL2.cubeList.add(new ModelBox(legL2, 13, 21, 0.0F, 0.0F, -3.5F, 5, 0, 4, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.legbase.addChild(legR3);
        this.setRotateAngle(legR3, -0.7418F, 0.48F, -0.829F);
        this.legR3.cubeList.add(new ModelBox(legR3, 13, 21, -5.0F, 0.0F, -3.5F, 5, 0, 4, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, 0.0F, 2.0F);
        this.legbase.addChild(legL3);
        this.setRotateAngle(legL3, -0.7418F, -0.48F, 0.829F);
        this.legL3.cubeList.add(new ModelBox(legL3, 13, 21, 0.0F, 0.0F, -3.5F, 5, 0, 4, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(0.5F, 0.0F, 2.75F);
        this.legbase.addChild(legR4);
        this.setRotateAngle(legR4, -0.6981F, 0.6109F, -0.9163F);
        this.legR4.cubeList.add(new ModelBox(legR4, 13, 21, -5.0F, 0.0F, -3.5F, 5, 0, 4, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.5F, 0.0F, 2.75F);
        this.legbase.addChild(legL4);
        this.setRotateAngle(legL4, -0.6981F, -0.6109F, 0.9163F);
        this.legL4.cubeList.add(new ModelBox(legL4, 13, 21, 0.0F, 0.0F, -3.5F, 5, 0, 4, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(0.5F, 0.0F, 3.5F);
        this.legbase.addChild(legR5);
        this.setRotateAngle(legR5, -0.48F, 0.1745F, -0.48F);
        this.legR5.cubeList.add(new ModelBox(legR5, 21, 0, -5.0F, 0.0F, -1.5F, 5, 0, 5, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.5F, 0.0F, 3.5F);
        this.legbase.addChild(legL5);
        this.setRotateAngle(legL5, -0.48F, -0.1745F, 0.48F);
        this.legL5.cubeList.add(new ModelBox(legL5, 21, 0, 0.0F, 0.0F, -1.5F, 5, 0, 5, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -2.5F, 2.0F);
        this.carapace.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.2618F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 23, 21, -2.0F, -0.25F, 0.0F, 4, 1, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 15, -1.5F, -0.25F, 4.0F, 3, 1, 2, 0.0F, false));

        this.gills = new AdvancedModelRenderer(this);
        this.gills.setRotationPoint(0.0F, 1.0F, -0.75F);
        this.abdomen.addChild(gills);
        this.setRotateAngle(gills, -0.0436F, 0.0F, 0.0F);


        this.gill1 = new AdvancedModelRenderer(this);
        this.gill1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gills.addChild(gill1);
        this.setRotateAngle(gill1, -0.0873F, 0.0F, 0.0F);
        this.gill1.cubeList.add(new ModelBox(gill1, 17, 16, -3.5F, 0.0F, 0.0F, 7, 0, 3, 0.0F, false));

        this.gill2 = new AdvancedModelRenderer(this);
        this.gill2.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.gills.addChild(gill2);
        this.setRotateAngle(gill2, -0.0873F, 0.0F, 0.0F);
        this.gill2.cubeList.add(new ModelBox(gill2, 17, 16, -3.5F, 0.0F, 0.0F, 7, 0, 3, 0.0F, false));

        this.gill3 = new AdvancedModelRenderer(this);
        this.gill3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.gills.addChild(gill3);
        this.setRotateAngle(gill3, -0.0873F, 0.0F, 0.0F);
        this.gill3.cubeList.add(new ModelBox(gill3, 17, 16, -3.5F, 0.0F, 0.0F, 7, 0, 3, 0.0F, false));

        this.gill4 = new AdvancedModelRenderer(this);
        this.gill4.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.gills.addChild(gill4);
        this.setRotateAngle(gill4, -0.0873F, 0.0F, 0.0F);
        this.gill4.cubeList.add(new ModelBox(gill4, 17, 16, -3.5F, 0.0F, 0.0F, 7, 0, 3, 0.0F, false));

        this.gill5 = new AdvancedModelRenderer(this);
        this.gill5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.gills.addChild(gill5);
        this.setRotateAngle(gill5, -0.0873F, 0.0F, 0.0F);
        this.gill5.cubeList.add(new ModelBox(gill5, 17, 16, -3.5F, 0.0F, 0.0F, 7, 0, 3, 0.0F, false));

        this.gill6 = new AdvancedModelRenderer(this);
        this.gill6.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.gills.addChild(gill6);
        this.setRotateAngle(gill6, -0.0873F, 0.0F, 0.0F);
        this.gill6.cubeList.add(new ModelBox(gill6, 17, 16, -3.5F, 0.0F, 0.0F, 7, 0, 3, 0.0F, false));

        this.part = new AdvancedModelRenderer(this);
        this.part.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.abdomen.addChild(part);
        this.setRotateAngle(part, -0.0873F, 0.0F, 0.2182F);
        this.part.cubeList.add(new ModelBox(part, 0, 0, 0.75F, -0.3F, 5.5F, 1, 0, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.part.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.48F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 21, 0.5F, -0.4F, -0.25F, 2, 0, 7, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 21, -2.25F, -0.9F, -0.25F, 3, 1, 7, 0.0F, false));

        this.part2 = new AdvancedModelRenderer(this);
        this.part2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.abdomen.addChild(part2);
        this.setRotateAngle(part2, -0.0873F, 0.0F, -0.2182F);
        this.part2.cubeList.add(new ModelBox(part2, 0, 0, -1.75F, -0.3F, 5.5F, 1, 0, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.part2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.48F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 21, -2.5F, -0.4F, -0.25F, 2, 0, 7, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 21, -0.75F, -0.9F, -0.25F, 3, 1, 7, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.abdomen.addChild(tail);
        this.setRotateAngle(tail, 0.1833F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 7, 9, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.carapace.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.carapace.offsetZ = -0.14F;
        this.carapace.render(0.037F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.carapace.offsetY = -0.7F;
        this.carapace.offsetX = 0.1F;
        this.carapace.offsetZ = 2.0F;
        this.carapace.rotateAngleY = (float)Math.toRadians(120);
        this.carapace.rotateAngleX = (float)Math.toRadians(1);
        this.carapace.rotateAngleZ = (float)Math.toRadians(0);
        this.carapace.scaleChildren = true;
        float scaler = 1.2F;
        this.carapace.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(carapace, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.carapace.render(f);
        //Reset rotations, positions and sizing:
        this.carapace.setScale(1.0F, 1.0F, 1.0F);
        this.carapace.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.carapace.offsetY = 0.65F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5};

        if (isAtBottom || (!e.isInWater()) || ((EntityPrehistoricFloraLimulid)e).isJumpingPF()) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.swing(tail, 0.25F, 0.5F, true, 0, 0, f2, 0.3F);



            this.bob(carapace, 0.0F, 0.0F, false, f2, 1);
        } else if(f3 > 0){
            this.carapace.rotateAngleZ = (float) Math.toRadians(180);
            this.carapace.rotateAngleX = (float) Math.toRadians(20);

            this.chainWave(legsL, 0.8F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.8F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.8F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.8F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.8F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.8F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.8F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.8F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.8F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.8F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.8F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.8F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.walk(tail, 0.4F, 0.5F, true, 0, 0, f2, 0.3F);


            this.bob(carapace, 0.4F, 0.7F, true, f2, 1);
        } else {

            this.carapace.rotateAngleZ = (float) Math.toRadians(180);
            this.carapace.rotateAngleX = (float) Math.toRadians(20);

            this.chainWave(legsL, 0.8F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.8F, 0.2F, -3, f2, 1);
            /*this.flap(legL, 0.8F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.8F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.8F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.8F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.8F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.8F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.8F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.8F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.8F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.8F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);*/

            this.walk(tail, 0.4F, 0.5F, true, 0, 0, f2, 0.3F);
            this.bob(carapace, 0.4F, 0.7F, true, f2, 1);
        }

    }
}
