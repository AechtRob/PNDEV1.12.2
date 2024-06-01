package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelTarracodiscus extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer tent;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tent2;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tent3;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacle11;
    private final AdvancedModelRenderer tentacle12;
    private final AdvancedModelRenderer tent4;
    private final AdvancedModelRenderer tentacle13;
    private final AdvancedModelRenderer tentacle14;
    private final AdvancedModelRenderer tentacle15;
    private final AdvancedModelRenderer tentacle16;

    public ModelTarracodiscus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -1.0F, -4.0F, 8, 1, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 19, -3.0F, -1.5F, -3.0F, 6, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 10, -3.5F, -2.0F, -3.5F, 7, 1, 7, 0.0F, false));

        this.tent = new AdvancedModelRenderer(this);
        this.tent.setRotationPoint(-3.0F, 0.0F, 4.0F);
        this.main.addChild(tent);


        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.tent.addChild(tentacle2);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 3, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.tent.addChild(tentacle4);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 3, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tent.addChild(tentacle);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.tent.addChild(tentacle3);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tent2 = new AdvancedModelRenderer(this);
        this.tent2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.main.addChild(tent2);


        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-1.0F, -2.0F, -4.0F);
        this.tent2.addChild(tentacle5);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 0, 3, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(3.0F, -2.0F, -4.0F);
        this.tent2.addChild(tentacle6);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 0, 3, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(-3.0F, -2.0F, -4.0F);
        this.tent2.addChild(tentacle7);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(1.0F, -2.0F, -4.0F);
        this.tent2.addChild(tentacle8);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tent3 = new AdvancedModelRenderer(this);
        this.tent3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.main.addChild(tent3);
        this.setRotateAngle(tent3, 0.0F, -1.5708F, 0.0F);


        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(-1.0F, -2.0F, -4.0F);
        this.tent3.addChild(tentacle9);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 0, 3, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(3.0F, -2.0F, -4.0F);
        this.tent3.addChild(tentacle10);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 0, 3, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.tentacle11 = new AdvancedModelRenderer(this);
        this.tentacle11.setRotationPoint(-3.0F, -2.0F, -4.0F);
        this.tent3.addChild(tentacle11);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tentacle12 = new AdvancedModelRenderer(this);
        this.tentacle12.setRotationPoint(1.0F, -2.0F, -4.0F);
        this.tent3.addChild(tentacle12);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.tent4 = new AdvancedModelRenderer(this);
        this.tent4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.main.addChild(tent4);
        this.setRotateAngle(tent4, 0.0F, 1.5708F, 0.0F);


        this.tentacle13 = new AdvancedModelRenderer(this);
        this.tentacle13.setRotationPoint(1.0F, -2.0F, -4.0F);
        this.tent4.addChild(tentacle13);
        this.tentacle13.cubeList.add(new ModelBox(tentacle13, 0, 3, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.tentacle14 = new AdvancedModelRenderer(this);
        this.tentacle14.setRotationPoint(-3.0F, -2.0F, -4.0F);
        this.tent4.addChild(tentacle14);
        this.tentacle14.cubeList.add(new ModelBox(tentacle14, 0, 3, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.tentacle15 = new AdvancedModelRenderer(this);
        this.tentacle15.setRotationPoint(3.0F, -2.0F, -4.0F);
        this.tent4.addChild(tentacle15);
        this.tentacle15.cubeList.add(new ModelBox(tentacle15, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.tentacle16 = new AdvancedModelRenderer(this);
        this.tentacle16.setRotationPoint(-1.0F, -2.0F, -4.0F);
        this.tent4.addChild(tentacle16);
        this.tentacle16.cubeList.add(new ModelBox(tentacle16, 0, 0, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);

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
        AdvancedModelRenderer[] tentacle1 = {this.tentacle};
        AdvancedModelRenderer[] tentacle2 = {this.tentacle2};
        AdvancedModelRenderer[] tentacle3 = {this.tentacle3};
        AdvancedModelRenderer[] tentacle4 = {this.tentacle4};
        AdvancedModelRenderer[] tentacle5 = {this.tentacle5};
        AdvancedModelRenderer[] tentacle6 = {this.tentacle6};
        AdvancedModelRenderer[] tentacle7 = {this.tentacle7};
        AdvancedModelRenderer[] tentacle8 = {this.tentacle8};
        AdvancedModelRenderer[] tentacle9 = {this.tentacle9};
        AdvancedModelRenderer[] tentacle10 = {this.tentacle10};
        AdvancedModelRenderer[] tentacle11 = {this.tentacle11};
        AdvancedModelRenderer[] tentacle12 = {this.tentacle12};
        AdvancedModelRenderer[] tentacle13 = {this.tentacle13};
        AdvancedModelRenderer[] tentacle14 = {this.tentacle14};
        AdvancedModelRenderer[] tentacle15 = {this.tentacle15};
        AdvancedModelRenderer[] tentacle16 = {this.tentacle16};
        //AdvancedModelRenderer[] arm1 = {this.Oralarm1a, this.Oralarm1b, this.Oralarm1c};
        //AdvancedModelRenderer[] arm2 = {this.Oralarm2a, this.Oralarm2b, this.Oralarm2c};
        //AdvancedModelRenderer[] arm3 = {this.Oralarm3a, this.Oralarm3b, this.Oralarm3c};
        //AdvancedModelRenderer[] arm4 = {this.Oralarm4a, this.Oralarm4b, this.Oralarm4c};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            //this.swing(main, speed * 0.4F, 0.15F, true, 0, 0, f2, 1);
            this.walk(main, speed * 0.3F, 0.15F, true, 0, 0, f2, 1);
            this.flap(main, speed * 0.2F, 0.3F, true, 0, 0, f2, 1);
            this.chainWave(tentacle1, speed, 0.4F, -3, f2, 1);
            this.chainWave(tentacle2, speed, 0.4F, -3, f2, 1);
            this.chainWave(tentacle3, speed, 0.4F, -3, f2, 1);
            this.chainWave(tentacle4, speed, 0.4F, -3, f2, 1);
            this.chainWave(tentacle5, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle6, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle7, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle8, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle9, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle10, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle11, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle12, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle13, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle14, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle15, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle16, speed, -0.4F, -3, f2, 1);
            //this.chainWave(arm1, speed, 0.1F, -3, f2, 1);
            //this.chainWave(arm2, speed, -0.1F, -3, f2, 1);
            //this.chainWave(arm3, speed, 0.1F, -3, f2, 1);
            //this.chainWave(arm4, speed, -0.1F, -3, f2, 1);
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
