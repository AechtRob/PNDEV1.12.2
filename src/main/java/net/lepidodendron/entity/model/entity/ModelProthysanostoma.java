package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelProthysanostoma extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer tentacleBase;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle19;
    private final AdvancedModelRenderer tentacle20;
    private final AdvancedModelRenderer tentacle21;
    private final AdvancedModelRenderer tentacle22;
    private final AdvancedModelRenderer tentacle23;
    private final AdvancedModelRenderer tentacle24;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacle13;
    private final AdvancedModelRenderer tentacle14;
    private final AdvancedModelRenderer tentacle15;
    private final AdvancedModelRenderer tentacle16;
    private final AdvancedModelRenderer tentacle17;
    private final AdvancedModelRenderer tentacle18;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacle11;
    private final AdvancedModelRenderer tentacle12;

    public ModelProthysanostoma() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.5F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -12.0F, -3.0F, 5, 2, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 8, -2.0F, -13.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.tentacleBase = new AdvancedModelRenderer(this);
        this.tentacleBase.setRotationPoint(-0.5F, -10.5F, -0.5F);
        this.main.addChild(tentacleBase);
        this.tentacleBase.cubeList.add(new ModelBox(tentacleBase, 11, 11, -1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.tentacleBase.addChild(tentacle);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 0, 8, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle.addChild(tentacle2);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 13, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle2.addChild(tentacle3);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 0, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle19 = new AdvancedModelRenderer(this);
        this.tentacle19.setRotationPoint(-0.75F, 2.5F, -0.75F);
        this.tentacleBase.addChild(tentacle19);
        this.setRotateAngle(tentacle19, 0.0F, 0.7854F, 0.0F);
        this.tentacle19.cubeList.add(new ModelBox(tentacle19, 0, 8, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacle20 = new AdvancedModelRenderer(this);
        this.tentacle20.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle19.addChild(tentacle20);
        this.tentacle20.cubeList.add(new ModelBox(tentacle20, 0, 13, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle21 = new AdvancedModelRenderer(this);
        this.tentacle21.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle20.addChild(tentacle21);
        this.tentacle21.cubeList.add(new ModelBox(tentacle21, 0, 0, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle22 = new AdvancedModelRenderer(this);
        this.tentacle22.setRotationPoint(0.75F, 2.5F, -0.75F);
        this.tentacleBase.addChild(tentacle22);
        this.setRotateAngle(tentacle22, 0.0F, -0.7854F, 0.0F);
        this.tentacle22.cubeList.add(new ModelBox(tentacle22, 0, 8, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.tentacle23 = new AdvancedModelRenderer(this);
        this.tentacle23.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle22.addChild(tentacle23);
        this.tentacle23.cubeList.add(new ModelBox(tentacle23, 0, 13, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.tentacle24 = new AdvancedModelRenderer(this);
        this.tentacle24.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle23.addChild(tentacle24);
        this.tentacle24.cubeList.add(new ModelBox(tentacle24, 0, 0, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(0.0F, 2.5F, 1.0F);
        this.tentacleBase.addChild(tentacle4);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 8, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle4.addChild(tentacle5);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 0, 13, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle5.addChild(tentacle6);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 0, 0, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle13 = new AdvancedModelRenderer(this);
        this.tentacle13.setRotationPoint(-0.6F, 2.5F, 0.75F);
        this.tentacleBase.addChild(tentacle13);
        this.setRotateAngle(tentacle13, 0.0F, -0.7854F, 0.0F);
        this.tentacle13.cubeList.add(new ModelBox(tentacle13, 0, 8, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacle14 = new AdvancedModelRenderer(this);
        this.tentacle14.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle13.addChild(tentacle14);
        this.tentacle14.cubeList.add(new ModelBox(tentacle14, 0, 13, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle15 = new AdvancedModelRenderer(this);
        this.tentacle15.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle14.addChild(tentacle15);
        this.tentacle15.cubeList.add(new ModelBox(tentacle15, 0, 0, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle16 = new AdvancedModelRenderer(this);
        this.tentacle16.setRotationPoint(0.6F, 2.5F, 0.75F);
        this.tentacleBase.addChild(tentacle16);
        this.setRotateAngle(tentacle16, 0.0F, 0.7854F, 0.0F);
        this.tentacle16.cubeList.add(new ModelBox(tentacle16, 0, 8, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.tentacle17 = new AdvancedModelRenderer(this);
        this.tentacle17.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle16.addChild(tentacle17);
        this.tentacle17.cubeList.add(new ModelBox(tentacle17, 0, 13, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.tentacle18 = new AdvancedModelRenderer(this);
        this.tentacle18.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle17.addChild(tentacle18);
        this.tentacle18.cubeList.add(new ModelBox(tentacle18, 0, 0, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(-1.0F, 2.5F, 0.0F);
        this.tentacleBase.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.0F, -1.5708F, 0.0F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 0, 8, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle7.addChild(tentacle8);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 0, 13, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle8.addChild(tentacle9);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 0, 0, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(1.0F, 2.5F, 0.0F);
        this.tentacleBase.addChild(tentacle10);
        this.setRotateAngle(tentacle10, 0.0F, 1.5708F, 0.0F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 0, 8, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.tentacle11 = new AdvancedModelRenderer(this);
        this.tentacle11.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle10.addChild(tentacle11);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 0, 13, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.tentacle12 = new AdvancedModelRenderer(this);
        this.tentacle12.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle11.addChild(tentacle12);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 0, 0, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.96F);

        this.main.render(f5);
        GlStateManager.disableBlend();

    }

    @Override
    public void renderStaticBook(float f) {

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

        //this.main.offsetY = 0.8F;
        this.main.setScaleX(1.0F);
        this.main.setScaleZ(1.0F);
        this.main.scaleChildren = false;
        AdvancedModelRenderer[] tentacle1 = {this.tentacle, this.tentacle2, this.tentacle3};
        AdvancedModelRenderer[] tentacle2 = {this.tentacle4, this.tentacle5, this.tentacle6};
        AdvancedModelRenderer[] tentacle3 = {this.tentacle7, this.tentacle8, this.tentacle9};
        AdvancedModelRenderer[] tentacle4 = {this.tentacle10, this.tentacle11, this.tentacle12};
        AdvancedModelRenderer[] arm1 = {this.tentacle13, this.tentacle14, this.tentacle15};
        AdvancedModelRenderer[] arm2 = {this.tentacle16, this.tentacle17, this.tentacle18};
        AdvancedModelRenderer[] arm3 = {this.tentacle19, this.tentacle20, this.tentacle21};
        AdvancedModelRenderer[] arm4 = {this.tentacle22, this.tentacle23, this.tentacle24};
        float speed = 0.07F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(main, speed * 0.4F, 0.1F, true, 0, 0, f2, 1);
            this.walk(main, speed * 0.3F, 0.2F, true, 0, 0, f2, 1);
            this.flap(main, speed * 0.2F, 0.4F, true, 0, 0, f2, 1);
            this.chainWave(tentacle1, speed, 0.4F, -3, f2, 1);
            this.chainWave(tentacle2, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle3, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle4, speed, -0.4F, -3, f2, 1);
            this.chainWave(arm1, speed, 0.4F, -3, f2, 1);
            this.chainWave(arm2, speed, 0.4F, -3, f2, 1);
            this.chainWave(arm3, speed, -0.4F, -3, f2, 1);
            this.chainWave(arm4, speed, -0.4F, -3, f2, 1);
            this.bob(main, -speed * 0.5F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 1.2F;
                this.main.scaleChildren = true;
                this.main.setScaleX(0.2F);
                this.main.setScaleZ(1.2F);
            }
        }
    }
}
