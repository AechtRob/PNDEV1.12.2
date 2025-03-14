package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelArchocyrtus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer WingR;
    private final AdvancedModelRenderer WingL;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer mouth;

    public ModelArchocyrtus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 25.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 10, 3, -1.0F, -6.0F, -6.0F, 2, 3, 3, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 8, 12, -0.5F, -5.0F, -7.25F, 1, 2, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 12, 0, -1.0F, -5.0F, -7.0F, 2, 2, 1, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.5F, -7.25F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, -0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 7, 0.05F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.5F, -7.25F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 7, -0.05F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.WingR = new AdvancedModelRenderer(this);
        this.WingR.setRotationPoint(-1.0F, -6.0F, -3.75F);
        this.Body.addChild(WingR);
        this.setRotateAngle(WingR, -0.3491F, -0.6545F, -0.2182F);
        this.WingR.cubeList.add(new ModelBox(WingR, 0, 0, 0.0F, 0.0F, 0.0F, 3, 0, 6, 0.0F, false));

        this.WingL = new AdvancedModelRenderer(this);
        this.WingL.setRotationPoint(1.0F, -6.0F, -3.75F);
        this.Body.addChild(WingL);
        this.setRotateAngle(WingL, -0.3491F, 0.6545F, 0.2182F);
        this.WingL.cubeList.add(new ModelBox(WingL, 0, 0, -3.0F, 0.0F, 0.0F, 3, 0, 6, 0.0F, true));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.0F, -3.0F, -5.5F);
        this.Body.addChild(legR1);
        this.setRotateAngle(legR1, -0.3927F, -0.5236F, 0.6981F);
        this.legR1.cubeList.add(new ModelBox(legR1, 2, 4, -1.5F, -0.5F, 0.0F, 2, 4, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, -3.0F, -5.5F);
        this.Body.addChild(legL);
        this.setRotateAngle(legL, -0.3927F, 0.5236F, -0.6981F);
        this.legL.cubeList.add(new ModelBox(legL, 2, 4, -0.5F, -0.5F, 0.0F, 2, 4, 0, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -3.0F, -4.5F);
        this.Body.addChild(legR2);
        this.setRotateAngle(legR2, 0.2618F, 0.3491F, 0.6981F);
        this.legR2.cubeList.add(new ModelBox(legR2, 2, 0, -1.5F, -0.5F, 0.25F, 2, 4, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -3.0F, -4.5F);
        this.Body.addChild(legL2);
        this.setRotateAngle(legL2, 0.2618F, -0.3491F, -0.6981F);
        this.legL2.cubeList.add(new ModelBox(legL2, 2, 0, -0.5F, -0.5F, 0.25F, 2, 4, 0, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -3.0F, -3.5F);
        this.Body.addChild(legR3);
        this.setRotateAngle(legR3, 0.7418F, 0.7418F, 1.0908F);
        this.legR3.cubeList.add(new ModelBox(legR3, 2, 12, -2.5F, -0.5F, 0.0F, 3, 5, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -3.0F, -3.5F);
        this.Body.addChild(legL3);
        this.setRotateAngle(legL3, 0.7418F, -0.7418F, -1.0908F);
        this.legL3.cubeList.add(new ModelBox(legL3, 2, 12, -0.5F, -0.5F, 0.0F, 3, 5, 0, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -4.0F, -3.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.1309F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 2, 6, -1.0F, -1.0F, -0.25F, 2, 2, 4, 0.0F, false));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, -3.25F, -6.75F);
        this.Body.addChild(mouth);
        this.setRotateAngle(mouth, -0.7418F, 0.0F, 0.0F);
        this.mouth.cubeList.add(new ModelBox(mouth, 0, 0, 0.0F, 0.0F, -0.5F, 0, 17, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Body.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(Body, -1.5F, 3.1F, 0.0F);
        this.setRotateAngle(mouth, 1.4F, 0.0F, 0.0F);
        this.Body.offsetZ = -0.0F;
        this.Body.offsetY = -0.25F;
        this.Body.offsetX = -0.00F;
        this.Body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(mouth, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(WingL, 0.3F, -1.2F, 0.0F);
        this.setRotateAngle(WingR, 0.3F, 1.2F, 0.0F);
        this.setRotateAngle(legR1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.0F);
        this.Body.offsetZ = 0.03F;
        this.Body.offsetY = -0.0F;
        this.Body.offsetX = 0.0F;
        this.Body.render(0.01F);
        this.resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

    }
    
    public void renderStaticDisplayCase(float f) {
        this.setRotateAngle(Body, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(mouth, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(WingL, 0.3F, -1.2F, 0.0F);
        this.setRotateAngle(WingR, 0.3F, 1.2F, 0.0F);
        this.setRotateAngle(legR1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.0F);
        this.Body.offsetY = 0.15F;
        this.Body.render(0.01F);
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
        //this.body.offsetY = 1.1F;

        EntityPrehistoricFloraInsectFlyingBase ee = (EntityPrehistoricFloraInsectFlyingBase) e;
        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) { //flying pose
            this.mouth.setScale(1,1,1);
            this.setRotateAngle(WingR, (float)Math.toRadians(19.0625), (float)Math.toRadians(69.5931), (float)Math.toRadians(56.1714));
            this.setRotateAngle(WingL, (float)Math.toRadians(19.0625), -(float)Math.toRadians(69.5931), -(float)Math.toRadians(56.1714));
            this.setRotateAngle(Body2, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.1745F, -0.1745F, 0.0F);
            this.setRotateAngle(cube_r2, -0.1745F, 0.1745F, 0.0F);
            this.setRotateAngle(legL, 0.3483F, 0.5525F, 0.5989F);
            this.setRotateAngle(legL2, 0.159F, -0.3916F, 0.4333F);
            this.setRotateAngle(legL3, 0.3546F, -0.2125F, 0.6707F);
            this.setRotateAngle(legR1, 0.3483F, -0.5525F, -0.5989F);
            this.setRotateAngle(legR2, 0.159F, 0.3916F, -0.4333F);
            this.setRotateAngle(legR3, 0.3546F, 0.2125F, -0.6707F);
            this.setRotateAngle(mouth, -0.6545F, 0.0F, 0.0F);

            float modifier = 1F;
            this.flap(WingL,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
           // this.flap(hindwingL,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);
            this.flap(WingR,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
           // this.flap(hindwingR,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);

            this.walk(legL,1.2F * modifier, 0.15F, true, 1,0, f2, 1F);
            this.walk(legL2,1.2F * modifier, 0.15F, true, 2,0, f2, 1F);
            this.walk(legL3,1.2F * modifier, 0.15F, true, 1,0, f2, 1F);

            this.walk(legR1,1.2F * modifier, 0.15F, false, 1,0, f2, 1F);
            this.walk(legR2,1.2F * modifier, 0.15F, false, 2,0, f2, 1F);
            this.walk(legR3,1.2F * modifier, 0.15F, false, 1,0, f2, 1F);

        } else {
            this.mouth.setScale(0,0,0);
            //this.setRotateAngle(mouth, (float)Math.toRadians(82.5), (float)Math.toRadians(0), (float)Math.toRadians(0));
        }
    }
}
