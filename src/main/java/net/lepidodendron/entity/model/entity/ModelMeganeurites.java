package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMeganeurites extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tailL;
    private final AdvancedModelRenderer tailR;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer hindwingR;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer forewingL;

    public ModelMeganeurites() {
        this.textureWidth = 52;
        this.textureHeight = 31;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.3051F, 19.939F, -0.2877F);
        this.body.cubeList.add(new ModelBox(body, 0, 8, -0.8051F, -0.039F, -1.9623F, 1, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 2, -0.4301F, 0.061F, 1.0377F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 13, -1.3051F, 0.061F, -1.9623F, 2, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 2, -1.1801F, 0.061F, 1.0377F, 1, 1, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.3051F, 0.561F, -0.4623F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 13, 8, -4.0F, -0.5F, 0.0F, 4, 4, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.6949F, 0.561F, 1.0377F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.6981F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 13, 8, 0.0F, -0.5F, 0.0F, 4, 4, 0, 0.0F, true));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.6949F, 0.561F, -1.9623F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.5236F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 13, 8, 0.0F, -0.5F, 0.0F, 4, 4, 0, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.6949F, 0.561F, -0.4623F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 13, 8, 0.0F, -0.5F, 0.0F, 4, 4, 0, 0.0F, true));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.3051F, 0.561F, -1.9623F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.5236F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 13, 8, -4.0F, -0.5F, 0.0F, 4, 4, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.3051F, 0.561F, 1.0377F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.6981F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 13, 8, -4.0F, -0.5F, 0.0F, 4, 4, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.3051F, 0.561F, 2.0377F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 8, -0.5F, -0.5F, 0.0F, 1, 1, 11, -0.001F, false));
        this.body2.cubeList.add(new ModelBox(body2, 9, 8, -0.5F, -0.5F, 0.0F, 1, 1, 17, -0.001F, false));
        this.body2.cubeList.add(new ModelBox(body2, -1, 28, -0.5F, 0.0F, 17.0F, 1, 0, 3, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6981F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -1, 21, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.001F, 16.2487F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, -1, 25, -0.5F, 0.001F, 0.0F, 1, 0, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.001F, 16.2487F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, -1, 25, -0.5F, 0.001F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6981F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, -1, 21, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.75F, 0.0F, 0.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0227F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 8, 0.0F, -0.5F, 0.0F, 1, 1, 11, -0.002F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.75F, 0.0F, 0.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.0227F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 8, -1.0F, -0.5F, 0.0F, 1, 1, 11, -0.002F, false));

        this.tailL = new AdvancedModelRenderer(this);
        this.tailL.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body2.addChild(tailL);
        this.setRotateAngle(tailL, 0.0F, 0.6981F, 0.0F);
        this.tailL.cubeList.add(new ModelBox(tailL, 3, 8, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.tailR = new AdvancedModelRenderer(this);
        this.tailR.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body2.addChild(tailR);
        this.setRotateAngle(tailR, 0.0F, -0.6981F, 0.0F);
        this.tailR.cubeList.add(new ModelBox(tailR, 3, 8, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.3051F, 0.561F, -1.5123F);
        this.body.addChild(head);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -0.345F, -1.9183F, 1, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 14, -0.5F, -0.595F, -1.9183F, 1, 1, 2, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.025F, 0.0F, 0.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 4, -0.0758F, -0.8223F, -1.4823F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.025F, 0.0F, 0.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, -0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 4, -0.9242F, -0.8223F, -1.4823F, 1, 1, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.45F, -0.4F, -1.6F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.2618F, -0.2182F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 17, 12, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.45F, -0.4F, -1.6F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.2618F, 0.2182F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 17, 12, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-0.763F, 0.02F, 1.575F);
        this.body.addChild(hindwingR);
        this.setRotateAngle(hindwingR, 0.0F, 0.0873F, 0.0F);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 0, 0, -20.0F, 0.001F, -0.5F, 20, 0, 4, 0.0F, false));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-0.6103F, 0.0F, 0.0F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.0F, -0.3491F, 0.0F);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 0, 4, -21.0F, 0.001F, -0.5F, 21, 0, 4, 0.0F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(0.1527F, 0.02F, 1.575F);
        this.body.addChild(hindwingL);
        this.setRotateAngle(hindwingL, 0.0F, -0.0873F, 0.0F);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 0, 0, 0.0F, 0.001F, -0.5F, 20, 0, 4, 0.0F, true));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(forewingL);
        this.setRotateAngle(forewingL, 0.0F, 0.3491F, 0.0F);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 4, 0.0F, 0.001F, -0.5F, 21, 0, 4, 0.0F, true));

        updateDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(legL1, 0.0F, 0.3F, 0.8F);
        this.setRotateAngle(legR1, 0.0F, -0.3F, -0.8F);
        this.setRotateAngle(legL2, 0.0F, 0.1F, 0.7F);
        this.setRotateAngle(legR2, 0.0F, -0.1F, -0.7F);
        this.setRotateAngle(legL3, 0.0F, -0.3F, 1.0F);
        this.setRotateAngle(legR3, 0.0F, 0.3F, -1.0F);
        this.setRotateAngle(forewingL, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(hindwingL, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(forewingR, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(hindwingR, 0.0F, 0.0F, 0.5F);
        this.body.offsetY = -0.15F;
        this.body.offsetX = 0.001F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(body, 0.1F, 0.0F, -0.1F);
        this.setRotateAngle(legL1, 0.0F, 0.3F, 0.8F);
        this.setRotateAngle(legR1, 0.0F, -0.3F, -0.8F);
        this.setRotateAngle(legL2, 0.0F, 0.1F, 0.7F);
        this.setRotateAngle(legR2, 0.0F, -0.1F, -0.7F);
        this.setRotateAngle(legL3, 0.0F, -0.3F, 1.0F);
        this.setRotateAngle(legR3, 0.0F, 0.3F, -1.0F);
        this.setRotateAngle(forewingL, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(hindwingL, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(forewingR, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(hindwingR, 0.0F, 0.0F, 0.5F);
        this.body.offsetY = -0.15F;
        this.body.offsetX = -0.013F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float)Math.toRadians(90);
        this.body.offsetY = -0.15F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.080F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.6F;
        this.body.offsetX = 0.15F;
        this.body.rotateAngleY = (float)Math.toRadians(-10);
        this.body.rotateAngleX = (float)Math.toRadians(60);
        this.body.rotateAngleZ = (float)Math.toRadians(-50);
        float scaler = 2.2F;
        this.body.scaleChildren = true;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(legL1, 0.0F, 0.3F, 0.8F);
        this.setRotateAngle(legR1, 0.0F, -0.3F, -0.8F);
        this.setRotateAngle(legL2, 0.0F, 0.1F, 0.7F);
        this.setRotateAngle(legR2, 0.0F, -0.1F, -0.7F);
        this.setRotateAngle(legL3, 0.0F, -0.3F, 1.0F);
        this.setRotateAngle(legR3, 0.0F, 0.3F, -1.0F);
        this.setRotateAngle(forewingL, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(hindwingL, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(forewingR, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(hindwingR, 0.0F, 0.0F, 0.5F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.body.offsetY = 1.05F;

        EntityPrehistoricFloraInsectFlyingBase ee = (EntityPrehistoricFloraInsectFlyingBase) e;
        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {
            this.setRotateAngle(legR3, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legR2, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL3, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(legL2, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(legR1, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL1, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(hindwingR, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(forewingR, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(forewingL, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(hindwingL, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(antennaL, -0.2618F, -0.2618F, 0.0F);
            this.setRotateAngle(antennaR, -0.2618F, 0.2618F, 0.0F);

            float modifier = 1F;

            this.flap(forewingL,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
            this.flap(hindwingL,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);

            this.flap(forewingR,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
            this.flap(hindwingR,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);

            this.flap(legL1,0.5F * modifier, 0.2F, false, 0,0.2F, f2, 1F);
            this.flap(legR1,0.5F * modifier, -0.2F, false, 0,-0.2F, f2, 1F);
            this.flap(legL2,0.5F * modifier, 0.2F, false, 1,0.2F, f2, 1F);
            this.flap(legR2,0.5F * modifier, -0.2F, false, 1,-0.2F, f2, 1F);
            this.flap(legL3,0.5F * modifier, 0.2F, false, 2,0.2F, f2, 1F);
            this.flap(legR3,0.5F * modifier, -0.2F, false, 2,-0.2F, f2, 1F);

        }

        this.walk(antennaL, 0.3F, -0.15F, false,0,0.1F, f2, 1F);
        this.walk(antennaR, 0.3F, 0.15F, false,0,0.1F, f2, 1F);
        this.swing(antennaL, 0.3F, -0.25F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.25F, false, 0, 0.1F, f2, 0.8F);

        this.swing(tailL, 0.3F, -0.15F, false, 0, -0.08F, f2, 0.8F);
        this.swing(tailR, 0.3F, 0.15F, false, 0, 0.08F, f2, 0.8F);


    }
}
