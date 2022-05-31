package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMonograptus;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMonograptus extends AdvancedModelBase {
    public AdvancedModelRenderer Floatingpiece;
    public AdvancedModelRenderer Spiral1;
    public AdvancedModelRenderer Spiral2;
    public AdvancedModelRenderer Spiral3;
    public AdvancedModelRenderer Spiral4;
    public AdvancedModelRenderer Spiral5;
    public AdvancedModelRenderer Spiral6;
    public AdvancedModelRenderer Spiral7;
    public AdvancedModelRenderer Spiral8;
    public AdvancedModelRenderer Spiral9;
    public AdvancedModelRenderer Spiral10;
    public AdvancedModelRenderer Spiral11;
    public AdvancedModelRenderer Spiral12;
    public AdvancedModelRenderer Spiral13;
    public AdvancedModelRenderer Spiral14;
    public AdvancedModelRenderer Spiral15;
    public AdvancedModelRenderer Spiral16;
    public AdvancedModelRenderer Spiral17;
    public AdvancedModelRenderer Spiral18;
    public AdvancedModelRenderer Spiral19;
    public AdvancedModelRenderer Spiral20;
    public AdvancedModelRenderer Spiral21;

    public ModelMonograptus() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Floatingpiece = new AdvancedModelRenderer(this, 11, 0);
        this.Floatingpiece.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Floatingpiece.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.Spiral5 = new AdvancedModelRenderer(this, 0, 14);
        this.Spiral5.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.Spiral5.addBox(0.0F, 0.0F, -1.75F, 5, 0, 2, 0.0F);
        this.setRotateAngle(Spiral5, -0.1911135497644277F, -1.0613347421062016F, -0.12740903872453743F);
        this.Spiral20 = new AdvancedModelRenderer(this, 0, 59);
        this.Spiral20.setRotationPoint(13.0F, 0.0F, 0.0F);
        this.Spiral20.addBox(0.0F, 0.0F, -1.75F, 14, 0, 2, 0.0F);
        this.setRotateAngle(Spiral20, -0.169820528229565F, -0.8066912015770679F, 0.1485275233394591F);
        this.Spiral11 = new AdvancedModelRenderer(this, 0, 32);
        this.Spiral11.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.Spiral11.addBox(0.0F, 0.0F, -1.75F, 8, 0, 2, 0.0F);
        this.setRotateAngle(Spiral11, -0.21223203437934937F, -0.8491027077268521F, 0.1485275233394591F);
        this.Spiral21 = new AdvancedModelRenderer(this, 0, 62);
        this.Spiral21.setRotationPoint(13.0F, 0.0F, 0.0F);
        this.Spiral21.addBox(0.0F, 0.0F, -1.75F, 15, 0, 2, 0.0F);
        this.setRotateAngle(Spiral21, -0.1485275233394591F, -0.7641051252178287F, 0.08482300397719036F);
        this.Spiral9 = new AdvancedModelRenderer(this, 0, 26);
        this.Spiral9.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.Spiral9.addBox(0.0F, 0.0F, -1.75F, 7, 0, 2, 0.0F);
        this.setRotateAngle(Spiral9, -0.21223203437934937F, -0.7853981633974483F, 0.1911135497644277F);
        this.Spiral13 = new AdvancedModelRenderer(this, 0, 38);
        this.Spiral13.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.Spiral13.addBox(0.0F, 0.0F, -1.75F, 9, 0, 2, 0.0F);
        this.setRotateAngle(Spiral13, -0.31834805156902407F, -0.8066912015770679F, 0.1485275233394591F);
        this.Spiral6 = new AdvancedModelRenderer(this, 0, 17);
        this.Spiral6.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.Spiral6.addBox(0.0F, 0.0F, -1.75F, 5, 0, 2, 0.0F);
        this.setRotateAngle(Spiral6, -0.33964105645913F, -0.9128071854772289F, 0.1911135497644277F);
        this.Spiral8 = new AdvancedModelRenderer(this, 0, 23);
        this.Spiral8.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.Spiral8.addBox(0.0F, 0.0F, -1.75F, 6, 0, 2, 0.0F);
        this.setRotateAngle(Spiral8, -0.46705011182842415F, -0.8278096695472326F, 0.33964105645913F);
        this.Spiral2 = new AdvancedModelRenderer(this, 0, 5);
        this.Spiral2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.Spiral2.addBox(0.0F, 0.0F, -1.75F, 4, 0, 2, 0.0F);
        this.setRotateAngle(Spiral2, -0.5307546228683145F, -1.2948598146651704F, 0.4457571069383183F);
        this.Spiral12 = new AdvancedModelRenderer(this, 0, 35);
        this.Spiral12.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.Spiral12.addBox(0.0F, 0.0F, -1.75F, 8, 0, 2, 0.0F);
        this.setRotateAngle(Spiral12, -0.27593656206399647F, -0.8066912015770679F, 0.27593656206399647F);
        this.Spiral7 = new AdvancedModelRenderer(this, 0, 20);
        this.Spiral7.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.Spiral7.addBox(0.0F, 0.0F, -1.75F, 6, 0, 2, 0.0F);
        this.setRotateAngle(Spiral7, -0.23352505591421208F, -0.9976301977767977F, 0.23352505591421208F);
        this.Spiral10 = new AdvancedModelRenderer(this, 0, 29);
        this.Spiral10.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.Spiral10.addBox(0.0F, 0.0F, -1.75F, 7, 0, 2, 0.0F);
        this.setRotateAngle(Spiral10, -0.27593656206399647F, -0.9765117298066328F, 0.1485275233394591F);
        this.Spiral3 = new AdvancedModelRenderer(this, 0, 8);
        this.Spiral3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.Spiral3.addBox(0.0F, 0.0F, -1.75F, 4, 0, 2, 0.0F);
        this.setRotateAngle(Spiral3, -0.9765117298066328F, -1.2948598146651704F, 0.9339256534473936F);
        this.Spiral4 = new AdvancedModelRenderer(this, 0, 11);
        this.Spiral4.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.Spiral4.addBox(0.0F, 0.0F, -1.75F, 5, 0, 2, 0.0F);
        this.setRotateAngle(Spiral4, -0.9128071854772289F, -0.8278096695472326F, 0.8702211756970171F);
        this.Spiral16 = new AdvancedModelRenderer(this, 0, 47);
        this.Spiral16.setRotationPoint(9.0F, 0.0F, 0.0F);
        this.Spiral16.addBox(0.0F, 0.0F, -1.75F, 11, 0, 2, 0.0F);
        this.setRotateAngle(Spiral16, -0.06370451936226872F, -0.8066912015770679F, 0.06370451936226872F);
        this.Spiral18 = new AdvancedModelRenderer(this, 0, 53);
        this.Spiral18.setRotationPoint(11.0F, 0.0F, 0.0F);
        this.Spiral18.addBox(0.0F, 0.0F, -1.75F, 13, 0, 2, 0.0F);
        this.setRotateAngle(Spiral18, -0.21223203437934937F, -0.8278096695472326F, 0.12740903872453743F);
        this.Spiral19 = new AdvancedModelRenderer(this, 0, 56);
        this.Spiral19.setRotationPoint(12.0F, 0.0F, 0.0F);
        this.Spiral19.addBox(0.0F, 0.0F, -1.75F, 14, 0, 2, 0.0F);
        this.setRotateAngle(Spiral19, -0.021293017373673524F, -0.8066912015770679F, 0.04241150198859518F);
        this.Spiral14 = new AdvancedModelRenderer(this, 0, 41);
        this.Spiral14.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.Spiral14.addBox(0.0F, 0.0F, -1.75F, 10, 0, 2, 0.0F);
        this.setRotateAngle(Spiral14, -0.1911135497644277F, -0.8278096695472326F, 0.12740903872453743F);
        this.Spiral17 = new AdvancedModelRenderer(this, 0, 50);
        this.Spiral17.setRotationPoint(10.0F, 0.0F, 0.0F);
        this.Spiral17.addBox(0.0F, 0.0F, -1.75F, 12, 0, 2, 0.0F);
        this.setRotateAngle(Spiral17, -0.1911135497644277F, -0.8066912015770679F, 0.12740903872453743F);
        this.Spiral15 = new AdvancedModelRenderer(this, 0, 44);
        this.Spiral15.setRotationPoint(9.0F, 0.0F, 0.0F);
        this.Spiral15.addBox(0.0F, 0.0F, -1.75F, 10, 0, 2, 0.0F);
        this.setRotateAngle(Spiral15, -0.1911135497644277F, -0.7853981633974483F, 0.0F);
        this.Spiral1 = new AdvancedModelRenderer(this, 0, 2);
        this.Spiral1.setRotationPoint(0.0F, -0.10000000149011612F, -0.5F);
        this.Spiral1.addBox(0.0F, 0.0F, -1.75F, 4, 0, 2, 0.0F);
        this.setRotateAngle(Spiral1, -0.23352505591421208F, -0.7853981633974483F, 0.38205256260891435F);
        this.Spiral4.addChild(this.Spiral5);
        this.Spiral19.addChild(this.Spiral20);
        this.Spiral10.addChild(this.Spiral11);
        this.Spiral20.addChild(this.Spiral21);
        this.Spiral8.addChild(this.Spiral9);
        this.Spiral12.addChild(this.Spiral13);
        this.Spiral5.addChild(this.Spiral6);
        this.Spiral7.addChild(this.Spiral8);
        this.Spiral1.addChild(this.Spiral2);
        this.Spiral11.addChild(this.Spiral12);
        this.Spiral6.addChild(this.Spiral7);
        this.Spiral9.addChild(this.Spiral10);
        this.Spiral2.addChild(this.Spiral3);
        this.Spiral3.addChild(this.Spiral4);
        this.Spiral15.addChild(this.Spiral16);
        this.Spiral17.addChild(this.Spiral18);
        this.Spiral18.addChild(this.Spiral19);
        this.Spiral13.addChild(this.Spiral14);
        this.Spiral16.addChild(this.Spiral17);
        this.Spiral14.addChild(this.Spiral15);
        this.Floatingpiece.addChild(this.Spiral1);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Floatingpiece.render(f5 * 0.195F);
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

        this.Floatingpiece.offsetY = 1.2F;
        EntityPrehistoricFloraMonograptus ee = (EntityPrehistoricFloraMonograptus) e;

        float speed = 0.13F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && e.isInWater()) {
            this.swing(Floatingpiece, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
            this.walk(Floatingpiece, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
            this.flap(Floatingpiece, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
            this.bob(Floatingpiece, -speed * 0.5F, 0.5F, false, f2, 0.6F);
            this.Floatingpiece.scaleChildren = true;
            float bouncer = (float) (Math.abs(Math.abs(Math.abs((double)ee.getRotationDegree() - 180D) - 90D) - 45D) / 90D);
            this.Floatingpiece.setScale(1 , (1 + bouncer), 1);
            this.Floatingpiece.rotateAngleY = (float) Math.toRadians(ee.getRotationDegree());
        }
    }
}
