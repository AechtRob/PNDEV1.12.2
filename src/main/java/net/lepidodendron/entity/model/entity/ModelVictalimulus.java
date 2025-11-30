package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraLimulid;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelVictalimulus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer gill1;
    private final AdvancedModelRenderer gill2;
    private final AdvancedModelRenderer gill3;
    private final AdvancedModelRenderer gill4;
    private final AdvancedModelRenderer gill5;
    private final AdvancedModelRenderer gill6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer front;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;

    public ModelVictalimulus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 23.85F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 16, -2.5F, -2.5F, -5.9F, 5, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.5F, -2.5F, -3.4F);
        this.carapace.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.6981F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 25, 0.0F, -0.025F, -1.0F, 1, 0, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 10, 0.0F, 0.0F, -2.5F, 3, 0, 6, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, -2.5F, -3.4F);
        this.carapace.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.6981F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 25, -1.0F, -0.025F, -1.0F, 1, 0, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -3.0F, 0.0F, -2.5F, 3, 0, 6, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.25F, -1.5F, -4.8F);
        this.carapace.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -0.2618F, -0.0873F);
        this.legright.cubeList.add(new ModelBox(legright, 20, 8, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.25F, -1.5F, -4.8F);
        this.carapace.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.2618F, 0.0873F);
        this.legleft.cubeList.add(new ModelBox(legleft, 20, 8, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.25F, -1.5F, -4.35F);
        this.carapace.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, -0.0436F, -0.0873F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 21, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.25F, -1.5F, -4.35F);
        this.carapace.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.0436F, 0.0873F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 21, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.25F, -1.5F, -3.9F);
        this.carapace.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.1309F, -0.0873F);
        this.legright3.cubeList.add(new ModelBox(legright3, 6, 21, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.25F, -1.5F, -3.9F);
        this.carapace.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, -0.1309F, 0.0873F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 6, 21, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.25F, -1.5F, -3.45F);
        this.carapace.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.3491F, -0.0873F);
        this.legright4.cubeList.add(new ModelBox(legright4, 12, 21, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.25F, -1.5F, -3.45F);
        this.carapace.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, -0.3491F, 0.0873F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 12, 21, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.25F, -1.5F, -3.0F);
        this.carapace.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.48F, -0.0873F);
        this.legright5.cubeList.add(new ModelBox(legright5, 20, 4, -4.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.25F, -1.5F, -3.0F);
        this.carapace.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, -0.48F, 0.0873F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 20, 4, 0.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -2.3F, -1.9F);
        this.carapace.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.2182F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 20, 6, -1.0F, 0.0F, 2.5F, 2, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 18, 19, -1.5F, 0.0F, 0.5F, 3, 1, 2, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 20, 0, -2.0F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.35F, 0.775F, 3.7F);
        this.abdomen.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.0908F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 25, -0.7F, 0.0F, -0.675F, 2, 0, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.8F, 1.025F, 3.2F);
        this.abdomen.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.9599F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 24, -2.2F, -1.0F, -3.0F, 2, 1, 1, -0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.1F, 1.025F, 3.7F);
        this.abdomen.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6981F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 15, -2.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.8F, 1.025F, 3.2F);
        this.abdomen.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.9599F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 24, 0.2F, -1.0F, -3.0F, 2, 1, 1, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.35F, 0.775F, 3.7F);
        this.abdomen.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.0908F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 25, -1.3F, 0.0F, -0.675F, 2, 0, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.1F, 0.775F, 2.05F);
        this.abdomen.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.4835F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 25, -0.5F, 0.0F, -3.2F, 1, 0, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.825F, 0.775F, 2.925F);
        this.abdomen.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -1.4835F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 25, -0.5F, 0.005F, -3.2F, 1, 0, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.825F, 0.775F, 2.925F);
        this.abdomen.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 1.4835F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 25, -0.5F, 0.005F, -3.2F, 1, 0, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.1F, 0.775F, 2.05F);
        this.abdomen.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 1.4835F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 25, -0.5F, 0.0F, -3.2F, 1, 0, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.1F, 1.025F, 3.7F);
        this.abdomen.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.6981F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 15, 0.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.gill1 = new AdvancedModelRenderer(this);
        this.gill1.setRotationPoint(0.0F, 1.0F, 0.05F);
        this.abdomen.addChild(gill1);
        this.setRotateAngle(gill1, 1.1781F, 0.0F, 0.0F);
        this.gill1.cubeList.add(new ModelBox(gill1, 18, 22, -1.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.gill2 = new AdvancedModelRenderer(this);
        this.gill2.setRotationPoint(0.0F, 1.0F, 0.4F);
        this.abdomen.addChild(gill2);
        this.setRotateAngle(gill2, 1.1781F, 0.0F, 0.0F);
        this.gill2.cubeList.add(new ModelBox(gill2, 0, 23, -1.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.gill3 = new AdvancedModelRenderer(this);
        this.gill3.setRotationPoint(0.0F, 1.0F, 0.75F);
        this.abdomen.addChild(gill3);
        this.setRotateAngle(gill3, 1.1781F, 0.0F, 0.0F);
        this.gill3.cubeList.add(new ModelBox(gill3, 6, 23, -1.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.gill4 = new AdvancedModelRenderer(this);
        this.gill4.setRotationPoint(0.0F, 1.0F, 1.1F);
        this.abdomen.addChild(gill4);
        this.setRotateAngle(gill4, 1.1781F, 0.0F, 0.0F);
        this.gill4.cubeList.add(new ModelBox(gill4, 12, 23, -1.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.gill5 = new AdvancedModelRenderer(this);
        this.gill5.setRotationPoint(0.0F, 1.0F, 1.45F);
        this.abdomen.addChild(gill5);
        this.setRotateAngle(gill5, 1.1781F, 0.0F, 0.0F);
        this.gill5.cubeList.add(new ModelBox(gill5, 18, 24, -1.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.gill6 = new AdvancedModelRenderer(this);
        this.gill6.setRotationPoint(0.0F, 1.0F, 1.8F);
        this.abdomen.addChild(gill6);
        this.setRotateAngle(gill6, 1.1781F, 0.0F, 0.0F);
        this.gill6.cubeList.add(new ModelBox(gill6, 24, 22, -1.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5F, 3.5F);
        this.abdomen.addChild(tail);
        this.setRotateAngle(tail, 0.1396F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F, false));

        this.front = new AdvancedModelRenderer(this);
        this.front.setRotationPoint(0.0F, -2.5F, -5.9F);
        this.carapace.addChild(front);
        this.setRotateAngle(front, 0.6981F, 0.0F, 0.0F);
        this.front.cubeList.add(new ModelBox(front, 18, 10, -2.5F, 0.0F, -3.0F, 5, 0, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.front.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.829F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 2, 0.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.front.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.829F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 2, -2.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.front.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 2.2689F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 13, -2.5F, 0.0F, -2.0F, 5, 0, 2, 0.0F, false));

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
        float scaler = 2.2F;
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

        AdvancedModelRenderer[] legsL = {this.legleft, this.legleft2, this.legleft3, this.legleft4, this.legleft5};
        AdvancedModelRenderer[] legsR = {this.legright, this.legright2, this.legright3, this.legright4, this.legright5};

        if (isAtBottom || (!e.isInWater()) || ((EntityPrehistoricFloraLimulid)e).isJumpingPF()) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(legleft, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legright, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legleft2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legright2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legleft3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legright3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legleft4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legright4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legleft5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legright5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.swing(tail, 0.25F, 0.5F, true, 0, 0, f2, 0.3F);



            this.bob(carapace, 0.0F, 0.0F, false, f2, 1);
        } else if(f3 > 0){
            this.carapace.rotateAngleZ = (float) Math.toRadians(180);
            this.carapace.rotateAngleX = (float) Math.toRadians(20);

            this.chainWave(legsL, 0.8F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.8F, 0.2F, -3, f2, 1);
            this.flap(legleft, 0.8F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legright, 0.8F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legleft2, 0.8F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legright2, 0.8F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legleft3, 0.8F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legright3, 0.8F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legleft4, 0.8F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legright4, 0.8F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legleft5, 0.8F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legright5, 0.8F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.walk(tail, 0.4F, 0.5F, true, 0, 0, f2, 0.3F);


            this.bob(carapace, 0.4F, 0.7F, true, f2, 1);
        } else {

            this.carapace.rotateAngleZ = (float) Math.toRadians(180);
            this.carapace.rotateAngleX = (float) Math.toRadians(20);

            this.chainWave(legsL, 0.8F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.8F, 0.2F, -3, f2, 1);
            /*this.flap(legleft, 0.8F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legright, 0.8F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legleft2, 0.8F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legright2, 0.8F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legleft3, 0.8F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legright3, 0.8F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legleft4, 0.8F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legright4, 0.8F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legleft5, 0.8F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legright5, 0.8F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);*/

            this.walk(tail, 0.4F, 0.5F, true, 0, 0, f2, 0.3F);
            this.bob(carapace, 0.4F, 0.7F, true, f2, 1);
        }

    }
}
