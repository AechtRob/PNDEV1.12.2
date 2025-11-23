package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMeganeuropsis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer jawR;
    private final AdvancedModelRenderer jawL;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer hindwingR;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tailL1;
    private final AdvancedModelRenderer tailR1;
    private final AdvancedModelRenderer tailL2;
    private final AdvancedModelRenderer tailR2;
    private final AdvancedModelRenderer tail3;

    public ModelMeganeuropsis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 38, 54, -2.5F, -3.0F, -4.75F, 5, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 35, 59, -1.99F, -3.425F, -4.76F, 4, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 47, -1.99F, -3.5F, -1.76F, 4, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 54, 53, -1.49F, -3.4F, 2.24F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 54, -2.5F, -3.0F, -1.75F, 5, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 36, -2.0F, -3.0F, 2.25F, 4, 2, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.25F, -4.75F);
        this.body.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.25F, -1.25F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 51, 58, -2.0F, -2.15F, -1.5F, 4, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.75F, -1.25F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, 1.5F, -0.64F, -0.99F, 1, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 7, 0.0F, -0.65F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.75F, -1.25F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, -0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 17, -2.5F, -0.64F, -0.99F, 1, 1, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 4, -2.0F, -0.65F, -1.0F, 2, 1, 2, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.15F, -0.75F, -2.5F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.2618F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 53, 48, 0.0F, 0.0F, -5.0F, 3, 0, 5, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.15F, -0.75F, -2.5F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.2618F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 42, -3.0F, 0.0F, -5.0F, 3, 0, 5, 0.0F, false));

        this.jawR = new AdvancedModelRenderer(this);
        this.jawR.setRotationPoint(-2.15F, 0.75F, -2.25F);
        this.head.addChild(jawR);
        this.setRotateAngle(jawR, 0.1745F, 0.1745F, 0.0F);
        this.jawR.cubeList.add(new ModelBox(jawR, 0, 10, 0.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, false));

        this.jawL = new AdvancedModelRenderer(this);
        this.jawL.setRotationPoint(2.15F, 0.75F, -2.25F);
        this.head.addChild(jawL);
        this.setRotateAngle(jawL, 0.1745F, -0.1745F, 0.0F);
        this.jawL.cubeList.add(new ModelBox(jawL, 3, 0, -2.0F, -0.01F, -2.0F, 2, 0, 2, 0.0F, false));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(2.0F, -3.5F, -0.5F);
        this.body.addChild(forewingL);
        this.setRotateAngle(forewingL, 0.0F, 0.3491F, 0.0873F);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 27, 0.0F, 0.0F, -2.0F, 38, 0, 9, 0.0F, false));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-2.0F, -3.5F, -0.5F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.0F, -0.3491F, -0.0873F);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 0, 18, -38.0F, 0.0F, -2.0F, 38, 0, 9, 0.0F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(1.5F, -3.4F, 3.0F);
        this.body.addChild(hindwingL);
        this.setRotateAngle(hindwingL, 0.0F, -0.0873F, 0.0873F);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 0, 9, 0.0F, 0.0F, -0.75F, 40, 0, 9, 0.0F, false));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-1.5F, -3.4F, 3.0F);
        this.body.addChild(hindwingR);
        this.setRotateAngle(hindwingR, 0.0F, 0.0873F, -0.0873F);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 0, 0, -40.0F, 0.0F, -0.75F, 40, 0, 9, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(2.0F, -2.0F, -4.65F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.5236F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 54, 0.0F, -0.5F, 0.0F, 10, 6, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-2.0F, -2.0F, -4.65F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.5236F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 46, 42, -10.0F, -0.5F, 0.0F, 10, 6, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.0F, -2.0F, -1.65F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 38, 48, 0.0F, -0.5F, 0.0F, 10, 6, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, -2.0F, -1.65F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 46, 36, -10.0F, -0.5F, 0.0F, 10, 6, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.75F, -2.0F, 2.2F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.6981F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 22, 42, 0.0F, -0.5F, 0.0F, 12, 6, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.75F, -2.0F, 2.2F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.6981F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 22, 36, -12.0F, -0.5F, 0.0F, 12, 6, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.25F, 6.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 36, -1.5F, -0.99F, 0.0F, 3, 2, 16, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 60, -1.0F, -0.49F, 16.0F, 2, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -0.5F, -0.49F, 19.0F, 1, 1, 3, 0.0F, false));

        this.tailL1 = new AdvancedModelRenderer(this);
        this.tailL1.setRotationPoint(1.0F, 0.0F, 18.0F);
        this.body2.addChild(tailL1);
        this.setRotateAngle(tailL1, 0.0F, -0.5236F, 0.0F);
        this.tailL1.cubeList.add(new ModelBox(tailL1, 0, 13, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.tailR1 = new AdvancedModelRenderer(this);
        this.tailR1.setRotationPoint(-1.0F, 0.0F, 18.0F);
        this.body2.addChild(tailR1);
        this.setRotateAngle(tailR1, 0.0F, 0.5236F, 0.0F);
        this.tailR1.cubeList.add(new ModelBox(tailR1, 0, 12, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.tailL2 = new AdvancedModelRenderer(this);
        this.tailL2.setRotationPoint(0.5F, 0.0F, 20.75F);
        this.body2.addChild(tailL2);
        this.setRotateAngle(tailL2, 0.0F, -0.3491F, 0.0F);
        this.tailL2.cubeList.add(new ModelBox(tailL2, 26, 50, 0.0F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.tailR2 = new AdvancedModelRenderer(this);
        this.tailR2.setRotationPoint(-0.5F, 0.0F, 20.75F);
        this.body2.addChild(tailR2);
        this.setRotateAngle(tailR2, 0.0F, 0.3491F, 0.0F);
        this.tailR2.cubeList.add(new ModelBox(tailR2, 26, 48, -5.0F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 22.0F);
        this.body2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 48, -1.5F, 0.075F, 0.0F, 3, 0, 4, 0.0F, false));

        updateDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.0F, 0.0F, 0.2F);
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
        this.body.offsetX = -0.02F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
//    public void renderStaticSuspended(float f) {
//        this.setRotateAngle(body, -0.0F, 0.0F, -0.1F);
//        this.setRotateAngle(legL1, 0.0F, 0.3F, 0.8F);
//        this.setRotateAngle(legR1, 0.0F, -0.3F, -0.8F);
//        this.setRotateAngle(legL2, 0.0F, 0.1F, 0.7F);
//        this.setRotateAngle(legR2, 0.0F, -0.1F, -0.7F);
//        this.setRotateAngle(legL3, 0.0F, -0.3F, 1.0F);
//        this.setRotateAngle(legR3, 0.0F, 0.3F, -1.0F);
//        this.setRotateAngle(forewingL, 0.0F, 0.0F, 0.5F);
//        this.setRotateAngle(hindwingL, 0.0F, 0.0F, -0.5F);
//        this.setRotateAngle(forewingR, 0.0F, 0.0F, -0.5F);
//        this.setRotateAngle(hindwingR, 0.0F, 0.0F, 0.5F);
//        this.body.offsetY = -0.15F;
//        this.body.offsetX = -0.01F;
//        this.body.render(0.01f);
//        resetToDefaultPose();
//    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float)Math.toRadians(90);
        this.body.offsetY = -0.15F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.060F;
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
        this.body.offsetY = -1.2F;
        this.body.offsetX = 0.1F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 1.0F;
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

        this.swing(jawL, 1.3F, -0.15F, false, 0, -0.08F, f2, 0.8F);
        this.swing(jawR, 1.3F, 0.15F, false, 0, 0.08F, f2, 0.8F);


    }
}
