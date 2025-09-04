package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVelisoptera extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer hindwingR;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cerciR;
    private final AdvancedModelRenderer cerciL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer cube_r1;

    public ModelVelisoptera() {
        this.textureWidth = 36;
        this.textureHeight = 24;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 16, 13, -1.0F, -1.425F, -4.0F, 2, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 13, -1.0F, -1.5F, -6.0F, 2, 1, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -1.5F, -6.0F, 1, 0, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 0.5F, -1.5F, -6.0F, 1, 0, 2, 0.0F, true));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-1.0F, -1.45F, -4.0F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.0F, 1.2217F, 0.0F);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 0, 5, -10.0F, -0.01F, -0.75F, 10, 0, 5, 0.0F, false));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(1.0F, -1.45F, -4.0F);
        this.body.addChild(forewingL);
        this.setRotateAngle(forewingL, 0.0F, -1.2217F, 0.0F);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 5, 0.0F, 0.0F, -0.75F, 10, 0, 5, 0.0F, true));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-1.0F, -1.375F, -2.5F);
        this.body.addChild(hindwingR);
        this.setRotateAngle(hindwingR, 0.0F, 1.3963F, 0.0F);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 0, 0, -10.0F, -0.06F, -0.75F, 10, 0, 5, 0.0F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(1.0F, -1.425F, -2.5F);
        this.body.addChild(hindwingL);
        this.setRotateAngle(hindwingL, 0.0F, -1.3963F, 0.0F);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 0, 0, 0.0F, 0.0F, -0.75F, 10, 0, 5, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -1.15F, -1.0F);
        this.body.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.0436F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 10, -1.0F, -0.25F, 0.0F, 2, 1, 6, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 3, -0.5F, -0.25F, 6.0F, 1, 1, 1, 0.0F, false));

        this.cerciR = new AdvancedModelRenderer(this);
        this.cerciR.setRotationPoint(-0.5F, 0.5F, 7.0F);
        this.abdomen.addChild(cerciR);
        this.setRotateAngle(cerciR, 0.0F, -0.3927F, -0.1309F);
        this.cerciR.cubeList.add(new ModelBox(cerciR, 0, 0, 0.0F, -2.5F, 0.0F, 0, 3, 17, 0.0F, false));

        this.cerciL = new AdvancedModelRenderer(this);
        this.cerciL.setRotationPoint(0.5F, 0.5F, 7.0F);
        this.abdomen.addChild(cerciL);
        this.setRotateAngle(cerciL, 0.0F, 0.3927F, 0.1309F);
        this.cerciL.cubeList.add(new ModelBox(cerciL, 0, 0, 0.0F, -2.5F, 0.0F, 0, 3, 17, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, -0.75F, -4.75F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, -0.7418F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 12, -3.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, -0.75F, -4.75F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.7418F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 12, 0.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -0.75F, -3.5F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.2618F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 10, -3.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -0.75F, -3.5F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -0.2618F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 10, 0.0F, -0.25F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -0.75F, -2.25F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 1.0472F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 20, -4.0F, -0.25F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -0.75F, -2.25F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -1.0472F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 20, 0.0F, -0.25F, 0.0F, 4, 2, 0, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.25F, -6.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 5, -0.5F, -0.25F, -1.0F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 7, -0.75F, -0.25F, -1.0F, 1, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 7, -0.25F, -0.25F, -1.0F, 1, 1, 1, -0.01F, true));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.5F, 0.25F, -1.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, -0.1745F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 10, 4, 0.0F, -3.0F, -6.0F, 0, 3, 6, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.5F, 0.25F, -1.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.1745F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 10, 4, 0.0F, -3.0F, -6.0F, 0, 3, 6, 0.0F, true));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, 0.75F, -1.0F);
        this.head.addChild(mouth);
        this.setRotateAngle(mouth, 0.0873F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.mouth.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -0.75F, -3.75F, 0, 1, 2, 0.0F, false));

        updateDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
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
        this.body.offsetX = 0.5F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(-10);
        this.body.rotateAngleX = (float)Math.toRadians(60);
        this.body.rotateAngleZ = (float)Math.toRadians(-50);
        float scaler = 2.2F;
        this.body.scaleChildren = true;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
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
            this.setRotateAngle(legR, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(legL, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(hindwingR, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(forewingR, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(forewingL, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(hindwingL, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(antennaL, -0.2618F, -0.2618F, 0.0F);
            this.setRotateAngle(antennaR, -0.2618F, 0.2618F, 0.0F);
            this.setRotateAngle(forewingL, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(forewingR, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(hindwingL, 0.0F, -0.3927F, 0.0F);
            this.setRotateAngle(hindwingR, 0.0F, 0.3927F, 0.0F);

            float modifier = 1F;

            this.flap(forewingL,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
            this.flap(hindwingL,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);

            this.flap(forewingR,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
            this.flap(hindwingR,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);

            this.flap(legL,0.5F * modifier, 0.2F, false, 0,0.2F, f2, 1F);
            this.flap(legR,0.5F * modifier, -0.2F, false, 0,-0.2F, f2, 1F);
            this.flap(legL2,0.5F * modifier, 0.2F, false, 1,0.2F, f2, 1F);
            this.flap(legR2,0.5F * modifier, -0.2F, false, 1,-0.2F, f2, 1F);
            this.flap(legL3,0.5F * modifier, 0.2F, false, 2,0.2F, f2, 1F);
            this.flap(legR3,0.5F * modifier, -0.2F, false, 2,-0.2F, f2, 1F);

        }

        this.walk(antennaL, 0.3F, -0.15F, false,0,0.1F, f2, 1F);
        this.walk(antennaR, 0.3F, 0.15F, false,0,0.1F, f2, 1F);
        this.swing(antennaL, 0.3F, -0.25F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.25F, false, 0, 0.1F, f2, 0.8F);

        this.swing(cerciL, 0.3F, -0.15F, false, 0, -0.08F, f2, 0.8F);
        this.swing(cerciR, 0.3F, 0.15F, false, 0, 0.08F, f2, 0.8F);


    }
}
