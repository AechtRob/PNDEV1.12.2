package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraTremaglaspis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelTremaglaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer tremaglaspis;
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftleg_1;
    private final AdvancedModelRenderer leftleg_2;
    private final AdvancedModelRenderer leftleg_3;
    private final AdvancedModelRenderer leftleg_4;
    private final AdvancedModelRenderer rightleg_1;
    private final AdvancedModelRenderer rightleg_2;
    private final AdvancedModelRenderer rightleg_3;
    private final AdvancedModelRenderer rightleg_4;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    public ModelTremaglaspis() {
        this.textureWidth = 30;
        this.textureHeight = 25;

        this.tremaglaspis = new AdvancedModelRenderer(this);
        this.tremaglaspis.setRotationPoint(0.0F, 23.9F, 0.0F);


        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(-0.5F, -0.1F, 0.0F);
        this.tremaglaspis.addChild(carapace);
        this.carapace.cubeList.add(new ModelBox(carapace, 19, 20, 0.0F, -2.0F, -5.0F, 1, 1, 2, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 11, 10, -1.0F, -1.25F, -5.0F, 3, 1, 2, -0.05F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.1548F, -6.8126F);
        this.carapace.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.4399F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.8126F, -1.1548F, -3.0F);
        this.carapace.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.1345F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 20, -1.0F, 0.0F, -2.0F, 1, 1, 2, -0.002F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.carapace.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.4363F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 14, -2.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.carapace.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3922F, 0.1964F, -0.4408F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -2.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 18, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -2.0F, -3.0F);
        this.carapace.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 14, 0.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.8126F, -1.1548F, -3.0F);
        this.carapace.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.1345F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 20, 0.0F, 0.0F, -2.0F, 1, 1, 2, -0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -2.0F, -5.0F);
        this.carapace.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3922F, -0.1964F, 0.4408F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 18, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.carapace.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 0, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, -1.8F, -3.0F);
        this.carapace.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 11, 2, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
        this.thorax.cubeList.add(new ModelBox(thorax, 0, 8, -0.5F, 0.5F, -0.1F, 2, 1, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.4932F, 0.7347F, 5.7441F);
        this.thorax.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1106F, 0.2585F, -0.2995F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 16, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1152F, 0.25F, 2.6736F);
        this.thorax.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0262F, 0.0396F, -0.3054F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.8F, -0.1F, -3.0F, 2, 1, 6, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.4932F, 0.7347F, 5.7441F);
        this.thorax.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1106F, -0.2585F, 0.2995F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 16, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.8848F, 0.25F, 2.6736F);
        this.thorax.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0262F, -0.0396F, 0.3054F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.2F, -0.1F, -3.0F, 2, 1, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.thorax.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 4, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

        this.leftleg_1 = new AdvancedModelRenderer(this);
        this.leftleg_1.setRotationPoint(0.55F, 1.5F, 0.5F);
        this.thorax.addChild(leftleg_1);
        this.setRotateAngle(leftleg_1, 0.0226F, 0.0843F, 0.2628F);
        this.leftleg_1.cubeList.add(new ModelBox(leftleg_1, 11, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftleg_2 = new AdvancedModelRenderer(this);
        this.leftleg_2.setRotationPoint(0.65F, 1.5F, 2.0F);
        this.thorax.addChild(leftleg_2);
        this.setRotateAngle(leftleg_2, 0.0F, 0.0F, 0.2618F);
        this.leftleg_2.cubeList.add(new ModelBox(leftleg_2, 11, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftleg_3 = new AdvancedModelRenderer(this);
        this.leftleg_3.setRotationPoint(0.6F, 1.5F, 3.5F);
        this.thorax.addChild(leftleg_3);
        this.setRotateAngle(leftleg_3, -0.0113F, -0.0421F, 0.262F);
        this.leftleg_3.cubeList.add(new ModelBox(leftleg_3, 11, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftleg_4 = new AdvancedModelRenderer(this);
        this.leftleg_4.setRotationPoint(0.45F, 1.5F, 5.0F);
        this.thorax.addChild(leftleg_4);
        this.setRotateAngle(leftleg_4, -0.0226F, -0.0843F, 0.2628F);
        this.leftleg_4.cubeList.add(new ModelBox(leftleg_4, 11, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg_1 = new AdvancedModelRenderer(this);
        this.rightleg_1.setRotationPoint(0.45F, 1.5F, 0.5F);
        this.thorax.addChild(rightleg_1);
        this.setRotateAngle(rightleg_1, 0.0226F, -0.0843F, -0.2628F);
        this.rightleg_1.cubeList.add(new ModelBox(rightleg_1, 11, 1, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg_2 = new AdvancedModelRenderer(this);
        this.rightleg_2.setRotationPoint(0.35F, 1.5F, 2.0F);
        this.thorax.addChild(rightleg_2);
        this.setRotateAngle(rightleg_2, 0.0F, 0.0F, -0.2618F);
        this.rightleg_2.cubeList.add(new ModelBox(rightleg_2, 11, 1, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg_3 = new AdvancedModelRenderer(this);
        this.rightleg_3.setRotationPoint(0.4F, 1.5F, 3.5F);
        this.thorax.addChild(rightleg_3);
        this.setRotateAngle(rightleg_3, -0.0113F, 0.0421F, -0.262F);
        this.rightleg_3.cubeList.add(new ModelBox(rightleg_3, 11, 1, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg_4 = new AdvancedModelRenderer(this);
        this.rightleg_4.setRotationPoint(0.55F, 1.5F, 5.0F);
        this.thorax.addChild(rightleg_4);
        this.setRotateAngle(rightleg_4, -0.0226F, 0.0843F, -0.2628F);
        this.rightleg_4.cubeList.add(new ModelBox(rightleg_4, 11, 1, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.275F, 7.975F);
        this.thorax.addChild(telson);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.25F, 0.3861F, -0.0171F);
        this.telson.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0309F, -0.0308F, -0.7849F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 16, -0.5F, 0.1F, -0.75F, 1, 1, 2, -0.002F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.25F, 0.3861F, -0.0171F);
        this.telson.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0309F, 0.0308F, 0.7849F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 16, -0.5F, 0.1F, -0.75F, 1, 1, 2, -0.002F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.275F, -2.0F);
        this.telson.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 20, 0.0F, 0.0F, 2.0F, 1, 1, 2, -0.002F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.tremaglaspis.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.tremaglaspis.offsetY = -2.0F;
        this.tremaglaspis.offsetX = -1.338F;
        this.tremaglaspis.rotateAngleY = (float)Math.toRadians(200);
        this.tremaglaspis.rotateAngleX = (float)Math.toRadians(8);
        this.tremaglaspis.rotateAngleZ = (float)Math.toRadians(-8);
        this.tremaglaspis.scaleChildren = true;
        float scaler = 1.63F;
        this.tremaglaspis.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.tremaglaspis.render(f);
        //Reset rotations, positions and sizing:
        this.tremaglaspis.setScale(1.0F, 1.0F, 1.0F);
        this.tremaglaspis.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(tremaglaspis, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(carapace, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(thorax, 0.0F, 0.1F, 0.0F);
        this.tremaglaspis.offsetY = 0.315F;
        this.tremaglaspis.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.pseudonaraoia.offsetY = 1.122F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftleg_1, this.leftleg_2, this.leftleg_3, leftleg_4};
        AdvancedModelRenderer[] legsR = {this.rightleg_1, this.rightleg_2, this.rightleg_3, rightleg_4};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraTremaglaspis) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leftleg_1, 0.5F, -0.2F, false, 0, -0.5F, f2, 0.3F);
                this.flap(rightleg_1, 0.5F, 0.2F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leftleg_2, 0.5F, -0.2F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg_2, 0.5F, 0.2F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg_3, 0.5F, -0.2F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg_3, 0.5F, 0.2F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg_4, 0.5F, -0.2F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg_4, 0.5F, 0.2F, false, 3.0F, 0.5F, f2, 0.3F);


            }
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leftleg_1, 0.2F, -0.2F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightleg_1, 0.2F, 0.2F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftleg_2, 0.2F, -0.2F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg_2, 0.2F, 0.2F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg_3, 0.2F, -0.2F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg_3, 0.2F, 0.2F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg_4, 0.2F, -0.2F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg_4, 0.2F, 0.2F, false, 3.0F, 0.5F, f2, 0.3F);


        }

//        this.swing(anntennae1, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
//        this.swing(anntennae2, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}