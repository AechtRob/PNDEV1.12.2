package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDamselfly extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer forewingright;
    private final AdvancedModelRenderer forewingleft;
    private final AdvancedModelRenderer hindwingright;
    private final AdvancedModelRenderer hindwingleft;

    public ModelDamselfly() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.25F, 0.0F);
        this.setRotateAngle(body, 0.2182F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 16, 18, -1.5F, -4.0F, -8.0F, 3, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.975F, -7.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 18, -1.0F, -2.0F, 0.0F, 1, 1, 3, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -2.0F, -7.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, -1.0F, -2.0F, 0.0F, 1, 1, 3, 0.02F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -3.5F, -4.75F);
        this.body.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.1309F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -0.5F, -0.5F, -0.25F, 1, 1, 13, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.5F, -3.25F, -6.25F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 0.6981F, 0.0873F, 1.1345F);
        this.legright3.cubeList.add(new ModelBox(legright3, 16, 20, 0.0F, 0.0F, 0.0F, 2, 4, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.5F, -3.25F, -6.25F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.6981F, -0.0873F, -1.1345F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 16, 20, -2.0F, 0.0F, 0.0F, 2, 4, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.5F, -3.25F, -6.5F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 0.2618F, 0.0F, 1.2217F);
        this.legright2.cubeList.add(new ModelBox(legright2, 20, 20, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.5F, -3.25F, -6.5F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.2618F, 0.0F, -1.2217F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 20, 20, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.5F, -3.25F, -6.75F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, -0.2618F, 0.0F, 1.2217F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 22, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.5F, -3.25F, -6.75F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, -0.2618F, 0.0F, -1.2217F);
        this.legleft.cubeList.add(new ModelBox(legleft, 0, 22, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, true));

        this.forewingright = new AdvancedModelRenderer(this);
        this.forewingright.setRotationPoint(-0.5F, -4.5F, -5.75F);
        this.body.addChild(forewingright);
        this.forewingright.cubeList.add(new ModelBox(forewingright, 0, 14, -10.0F, 0.0F, 0.0F, 10, 0, 2, 0.0F, false));

        this.forewingleft = new AdvancedModelRenderer(this);
        this.forewingleft.setRotationPoint(0.5F, -4.5F, -5.75F);
        this.body.addChild(forewingleft);
        this.forewingleft.cubeList.add(new ModelBox(forewingleft, 0, 14, 0.0F, 0.0F, 0.0F, 10, 0, 2, 0.0F, true));

        this.hindwingright = new AdvancedModelRenderer(this);
        this.hindwingright.setRotationPoint(-0.5F, -4.25F, -4.75F);
        this.body.addChild(hindwingright);
        this.setRotateAngle(hindwingright, 0.0F, 0.2618F, 0.0F);
        this.hindwingright.cubeList.add(new ModelBox(hindwingright, 0, 16, -10.0F, 0.0F, 0.0F, 10, 0, 2, 0.0F, false));

        this.hindwingleft = new AdvancedModelRenderer(this);
        this.hindwingleft.setRotationPoint(0.5F, -4.25F, -4.75F);
        this.body.addChild(hindwingleft);
        this.setRotateAngle(hindwingleft, 0.0F, -0.2618F, 0.0F);
        this.hindwingleft.cubeList.add(new ModelBox(hindwingleft, 0, 16, 0.0F, 0.0F, 0.0F, 10, 0, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void renderStaticDisplayCase(float f) {
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.6F;
        this.body.offsetX = -0.6F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(220);
        this.body.rotateAngleX = (float)Math.toRadians(20);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 4.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

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
//        this.body.offsetY = 1.1F;

        EntityPrehistoricFloraInsectFlyingBase ee = (EntityPrehistoricFloraInsectFlyingBase) e;
        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) { //flying pose


            float modifier = 1F;
            this.flap(forewingleft,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
            this.flap(hindwingleft,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);
            this.flap(forewingright,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
            this.flap(hindwingright,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);

            this.flap(legleft,1.2F * modifier, 0.1F, true, 1,0, f2, 1F);
            this.flap(legleft2,1.2F * modifier, 0.1F, true, 2,0, f2, 1F);
            this.flap(legleft3,1.2F * modifier, 0.1F, true, 1,0, f2, 1F);

            this.flap(legright,1.2F * modifier, 0.1F, false, 1,0, f2, 1F);
            this.flap(legright2,1.2F * modifier, 0.1F, false, 2,0, f2, 1F);
            this.flap(legright3,1.2F * modifier, 0.1F, false, 1,0, f2, 1F);

        } else {
            this.setRotateAngle(forewingleft, 0.0F, -1.309F, -1.3963F);
            this.setRotateAngle(forewingright, 0.0F, 1.309F, 1.3963F);
            this.setRotateAngle(hindwingleft, 0.0F, -1.309F, -1.4835F);
            this.setRotateAngle(hindwingright, 0.0F, 1.309F, 1.4835F);
        }
    }
}
