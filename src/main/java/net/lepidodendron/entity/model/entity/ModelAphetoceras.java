package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAphetoceras extends AdvancedModelBase {
    public AdvancedModelRenderer shellbase;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer shell1;
    public AdvancedModelRenderer shellcover1;
    public AdvancedModelRenderer hyponome;
    public AdvancedModelRenderer headleft;
    public AdvancedModelRenderer headright;
    public AdvancedModelRenderer tentacle1a;
    public AdvancedModelRenderer tentacle2a;
    public AdvancedModelRenderer tentacle3a;
    public AdvancedModelRenderer tentacle4a;
    public AdvancedModelRenderer tentacle5a;
    public AdvancedModelRenderer tentacle6a;
    public AdvancedModelRenderer tentacle7a;
    public AdvancedModelRenderer tentacle8a;
    public AdvancedModelRenderer tentacle9a;
    public AdvancedModelRenderer tentacle10a;
    public AdvancedModelRenderer shellcover2;
    public AdvancedModelRenderer shellcovertop;
    public AdvancedModelRenderer shellcovertop2;
    public AdvancedModelRenderer eyeleft;
    public AdvancedModelRenderer eyeright;
    public AdvancedModelRenderer tentacle1b;
    public AdvancedModelRenderer tentacle2b;
    public AdvancedModelRenderer tentacle3b;
    public AdvancedModelRenderer tentacle4b;
    public AdvancedModelRenderer tentacle5b;
    public AdvancedModelRenderer tentacle6b;
    public AdvancedModelRenderer tentacle7b;
    public AdvancedModelRenderer tentacle8b;
    public AdvancedModelRenderer tentacle9b;
    public AdvancedModelRenderer tentacle10b;
    public AdvancedModelRenderer shell2;
    public AdvancedModelRenderer shell3;
    public AdvancedModelRenderer shell4;
    public AdvancedModelRenderer shell5;
    public AdvancedModelRenderer shell6;
    public AdvancedModelRenderer shell7;
    public AdvancedModelRenderer shell8;
    public AdvancedModelRenderer shell9;
    public AdvancedModelRenderer shell10;
    public AdvancedModelRenderer shell11;
    public AdvancedModelRenderer shell12;
    public AdvancedModelRenderer shelltip;

    public ModelAphetoceras() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.tentacle6a = new AdvancedModelRenderer(this, 89, 18);
        this.tentacle6a.setRotationPoint(-3.7F, 2.3F, 1.0F);
        this.tentacle6a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle6a, 0.10471975511965977F, 0.0F, -2.443460952792061F);
        this.tentacle9a = new AdvancedModelRenderer(this, 89, 18);
        this.tentacle9a.setRotationPoint(1.3F, -4.5F, 1.0F);
        this.tentacle9a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle9a, 0.10471975511965977F, 0.0F, 0.17453292519943295F);
        this.tentacle2b = new AdvancedModelRenderer(this, 105, 6);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle2b.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(tentacle2b, 0.05235987755982988F, 0.0F, 0.0F);
        this.shell12 = new AdvancedModelRenderer(this, 0, 50);
        this.shell12.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shell12.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 5, 0.0F);
        this.setRotateAngle(shell12, 0.6283185307179586F, 0.0F, 0.0F);
        this.eyeleft = new AdvancedModelRenderer(this, 0, 8);
        this.eyeleft.setRotationPoint(0.7F, -2.5F, 8.0F);
        this.eyeleft.addBox(0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.tentacle2a = new AdvancedModelRenderer(this, 89, 18);
        this.tentacle2a.setRotationPoint(-4.7F, -0.4F, 1.0F);
        this.tentacle2a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle2a, 0.10471975511965977F, 0.0F, -1.5707963267948966F);
        this.shell6 = new AdvancedModelRenderer(this, 0, 72);
        this.shell6.setRotationPoint(0.0F, 0.7F, 10.2F);
        this.shell6.addBox(-3.5F, -3.5F, 0.0F, 7, 7, 11, 0.0F);
        this.setRotateAngle(shell6, 0.5235987755982988F, 0.0F, 0.0F);
        this.tentacle6b = new AdvancedModelRenderer(this, 105, 6);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle6b.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(tentacle6b, 0.05235987755982988F, 0.0F, 0.0F);
        this.tentacle9b = new AdvancedModelRenderer(this, 105, 6);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle9b.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(tentacle9b, 0.05235987755982988F, 0.0F, 0.0F);
        this.hyponome = new AdvancedModelRenderer(this, 0, 27);
        this.hyponome.setRotationPoint(0.0F, 3.0F, 4.8F);
        this.hyponome.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(hyponome, -1.1344640137963142F, 0.0F, 0.0F);
        this.shell7 = new AdvancedModelRenderer(this, 74, 2);
        this.shell7.setRotationPoint(0.0F, 0.7F, 9.2F);
        this.shell7.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 10, 0.0F);
        this.setRotateAngle(shell7, 0.5235987755982988F, 0.0F, 0.0F);
        this.tentacle1a = new AdvancedModelRenderer(this, 89, 18);
        this.tentacle1a.setRotationPoint(4.7F, -0.4F, 1.0F);
        this.tentacle1a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle1a, 0.10471975511965977F, 0.0F, 1.5707963267948966F);
        this.tentacle3a = new AdvancedModelRenderer(this, 89, 18);
        this.tentacle3a.setRotationPoint(3.7F, -3.1F, 1.0F);
        this.tentacle3a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle3a, 0.10471975511965977F, 0.0F, 0.8726646259971648F);
        this.shell3 = new AdvancedModelRenderer(this, 41, 14);
        this.shell3.setRotationPoint(-1.0F, 0.1F, 9.0F);
        this.shell3.addBox(-5.0F, -5.0F, 0.0F, 10, 10, 13, 0.0F);
        this.setRotateAngle(shell3, 0.6108652381980153F, 0.0F, 0.0F);
        this.tentacle1b = new AdvancedModelRenderer(this, 105, 6);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle1b.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(tentacle1b, 0.05235987755982988F, 0.0F, 0.0F);
        this.headright = new AdvancedModelRenderer(this, 36, 76);
        this.headright.setRotationPoint(-6.0F, -0.2F, 0.0F);
        this.headright.addBox(0.0F, -4.5F, 0.0F, 1, 9, 12, 0.0F);
        this.shell5 = new AdvancedModelRenderer(this, 68, 49);
        this.shell5.setRotationPoint(0.0F, 0.8F, 7.9F);
        this.shell5.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 12, 0.0F);
        this.setRotateAngle(shell5, 0.4886921905584123F, 0.0F, 0.0F);
        this.shell4 = new AdvancedModelRenderer(this, 71, 69);
        this.shell4.setRotationPoint(0.0F, 0.9F, 11.0F);
        this.shell4.addBox(-4.5F, -4.5F, 0.0F, 9, 9, 10, 0.0F);
        this.setRotateAngle(shell4, 0.4886921905584123F, 0.0F, 0.0F);
        this.shell10 = new AdvancedModelRenderer(this, 68, 0);
        this.shell10.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.shell10.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(shell10, 0.6283185307179586F, 0.0F, 0.0F);
        this.shell11 = new AdvancedModelRenderer(this, 0, 0);
        this.shell11.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shell11.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(shell11, 0.5585053606381855F, 0.0F, 0.0F);
        this.tentacle7a = new AdvancedModelRenderer(this, 89, 18);
        this.tentacle7a.setRotationPoint(1.3F, 3.7F, 1.0F);
        this.tentacle7a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle7a, 0.10471975511965977F, 0.0F, 2.96705972839036F);
        this.shellcover1 = new AdvancedModelRenderer(this, 31, 61);
        this.shellcover1.setRotationPoint(0.0F, -6.7F, 0.0F);
        this.shellcover1.addBox(-6.0F, 0.0F, -1.0F, 12, 2, 13, 0.0F);
        this.shellcovertop2 = new AdvancedModelRenderer(this, 68, 46);
        this.shellcovertop2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.shellcovertop2.addBox(-3.5F, -1.0F, 0.0F, 7, 1, 2, 0.0F);
        this.shell2 = new AdvancedModelRenderer(this, 34, 38);
        this.shell2.setRotationPoint(1.0F, 1.9F, 12.1F);
        this.shell2.addBox(-6.5F, -6.5F, 0.0F, 11, 11, 12, 0.0F);
        this.setRotateAngle(shell2, 0.4886921905584123F, 0.0F, 0.0F);
        this.shell8 = new AdvancedModelRenderer(this, 53, 88);
        this.shell8.setRotationPoint(0.0F, 0.6F, 8.3F);
        this.shell8.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 9, 0.0F);
        this.setRotateAngle(shell8, 0.6632251157578453F, 0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 0, 50);
        this.head.setRotationPoint(0.0F, 1.4F, -22.0F);
        this.head.addBox(-5.0F, -5.0F, 0.0F, 10, 10, 12, 0.0F);
        this.tentacle8b = new AdvancedModelRenderer(this, 105, 6);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle8b.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(tentacle8b, 0.05235987755982988F, 0.0F, 0.0F);
        this.tentacle8a = new AdvancedModelRenderer(this, 89, 18);
        this.tentacle8a.setRotationPoint(-1.3F, 3.7F, 1.0F);
        this.tentacle8a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle8a, 0.10471975511965977F, 0.0F, -2.96705972839036F);
        this.tentacle10a = new AdvancedModelRenderer(this, 89, 18);
        this.tentacle10a.setRotationPoint(-1.3F, -4.5F, 1.0F);
        this.tentacle10a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle10a, 0.10471975511965977F, 0.0F, -0.17453292519943295F);
        this.tentacle5a = new AdvancedModelRenderer(this, 89, 18);
        this.tentacle5a.setRotationPoint(3.7F, 2.3F, 1.0F);
        this.tentacle5a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle5a, 0.10471975511965977F, 0.0F, 2.443460952792061F);
        this.eyeright = new AdvancedModelRenderer(this, 39, 0);
        this.eyeright.setRotationPoint(-0.8F, -2.5F, 8.0F);
        this.eyeright.addBox(0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.tentacle5b = new AdvancedModelRenderer(this, 105, 6);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle5b.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(tentacle5b, 0.05235987755982988F, 0.0F, 0.0F);
        this.tentacle3b = new AdvancedModelRenderer(this, 105, 6);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle3b.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(tentacle3b, 0.05235987755982988F, 0.0F, 0.0F);
        this.shellcover2 = new AdvancedModelRenderer(this, 74, 18);
        this.shellcover2.setRotationPoint(0.0F, 0.8F, -2.8F);
        this.shellcover2.addBox(-5.0F, 0.0F, 0.0F, 10, 1, 2, 0.0F);
        this.setRotateAngle(shellcover2, 0.41887902047863906F, 0.0F, 0.0F);
        this.shellcovertop = new AdvancedModelRenderer(this, 39, 0);
        this.shellcovertop.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shellcovertop.addBox(-4.5F, -1.0F, 0.0F, 9, 1, 11, 0.0F);
        this.tentacle4b = new AdvancedModelRenderer(this, 105, 6);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle4b.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(tentacle4b, 0.05235987755982988F, 0.0F, 0.0F);
        this.tentacle7b = new AdvancedModelRenderer(this, 105, 6);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle7b.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(tentacle7b, 0.05235987755982988F, 0.0F, 0.0F);
        this.tentacle10b = new AdvancedModelRenderer(this, 105, 6);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle10b.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(tentacle10b, 0.05235987755982988F, 0.0F, 0.0F);
        this.shell9 = new AdvancedModelRenderer(this, 64, 102);
        this.shell9.setRotationPoint(0.0F, 0.2F, 7.8F);
        this.shell9.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 7, 0.0F);
        this.setRotateAngle(shell9, 0.5585053606381855F, 0.0F, 0.0F);
        this.shell1 = new AdvancedModelRenderer(this, 0, 0);
        this.shell1.setRotationPoint(0.0F, 1.1F, -2.6F);
        this.shell1.addBox(-6.0F, -6.0F, 0.0F, 12, 12, 15, 0.0F);
        this.setRotateAngle(shell1, 0.45378560551852565F, 0.0F, 0.0F);
        this.shelltip = new AdvancedModelRenderer(this, 50, 66);
        this.shelltip.setRotationPoint(0.0F, -1.5F, 1.2F);
        this.shelltip.addBox(0.0F, -5.0F, 0.0F, 0, 10, 10, 0.0F);
        this.setRotateAngle(shelltip, 0.9316567547145731F, 0.0F, 0.0F);
        this.headleft = new AdvancedModelRenderer(this, 75, 25);
        this.headleft.setRotationPoint(5.0F, -0.2F, 0.0F);
        this.headleft.addBox(0.0F, -4.5F, 0.0F, 1, 9, 12, 0.0F);
        this.tentacle4a = new AdvancedModelRenderer(this, 89, 18);
        this.tentacle4a.setRotationPoint(-3.7F, -3.1F, 1.0F);
        this.tentacle4a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle4a, 0.10471975511965977F, 0.0F, -0.8726646259971648F);
        this.shellbase = new AdvancedModelRenderer(this, 0, 27);
        this.shellbase.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shellbase.addBox(-6.5F, -6.3F, -10.0F, 13, 13, 10, 0.0F);
        this.setRotateAngle(shellbase, 0.0F, 3.141592653589793F, -0.045553093477052F);
        this.head.addChild(this.tentacle6a);
        this.head.addChild(this.tentacle9a);
        this.tentacle2a.addChild(this.tentacle2b);
        this.shell11.addChild(this.shell12);
        this.headleft.addChild(this.eyeleft);
        this.head.addChild(this.tentacle2a);
        this.shell5.addChild(this.shell6);
        this.tentacle6a.addChild(this.tentacle6b);
        this.tentacle9a.addChild(this.tentacle9b);
        this.head.addChild(this.hyponome);
        this.shell6.addChild(this.shell7);
        this.head.addChild(this.tentacle1a);
        this.head.addChild(this.tentacle3a);
        this.shell2.addChild(this.shell3);
        this.tentacle1a.addChild(this.tentacle1b);
        this.head.addChild(this.headright);
        this.shell4.addChild(this.shell5);
        this.shell3.addChild(this.shell4);
        this.shell9.addChild(this.shell10);
        this.shell10.addChild(this.shell11);
        this.head.addChild(this.tentacle7a);
        this.head.addChild(this.shellcover1);
        this.shellcovertop.addChild(this.shellcovertop2);
        this.shell1.addChild(this.shell2);
        this.shell7.addChild(this.shell8);
        this.shellbase.addChild(this.head);
        this.tentacle8a.addChild(this.tentacle8b);
        this.head.addChild(this.tentacle8a);
        this.head.addChild(this.tentacle10a);
        this.head.addChild(this.tentacle5a);
        this.headright.addChild(this.eyeright);
        this.tentacle5a.addChild(this.tentacle5b);
        this.tentacle3a.addChild(this.tentacle3b);
        this.shellcover1.addChild(this.shellcover2);
        this.shellcover1.addChild(this.shellcovertop);
        this.tentacle4a.addChild(this.tentacle4b);
        this.tentacle7a.addChild(this.tentacle7b);
        this.tentacle10a.addChild(this.tentacle10b);
        this.shell8.addChild(this.shell9);
        this.shellbase.addChild(this.shell1);
        this.shell12.addChild(this.shelltip);
        this.head.addChild(this.headleft);
        this.head.addChild(this.tentacle4a);

        this.tentacle2a.rotateAngleX = -0.28F;
        this.tentacle4a.rotateAngleX = -0.28F;
        this.tentacle6a.rotateAngleX = -0.28F;
        this.tentacle8a.rotateAngleX = -0.28F;
        this.tentacle10a.rotateAngleX = -0.28F;
        this.tentacle1a.rotateAngleX = -0.28F;
        this.tentacle3a.rotateAngleX = -0.28F;
        this.tentacle5a.rotateAngleX = -0.28F;
        this.tentacle9a.rotateAngleX = -0.28F;
        this.tentacle7a.rotateAngleX = -0.28F;

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shellbase.render(f5 * 0.2F);
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
        this.shellbase.offsetY = 1.2F;

        AdvancedModelRenderer[] tentacle1 = {this.tentacle1a, this.tentacle1b};
        AdvancedModelRenderer[] tentacle2 = {this.tentacle2a, this.tentacle2b};
        AdvancedModelRenderer[] tentacle3 = {this.tentacle3a, this.tentacle3b};
        AdvancedModelRenderer[] tentacle4 = {this.tentacle4a, this.tentacle4b};
        AdvancedModelRenderer[] tentacle5 = {this.tentacle5a, this.tentacle5b};
        AdvancedModelRenderer[] tentacle6 = {this.tentacle6a, this.tentacle6b};
        AdvancedModelRenderer[] tentacle7 = {this.tentacle7a, this.tentacle7b};
        AdvancedModelRenderer[] tentacle8 = {this.tentacle8a, this.tentacle8b};
        AdvancedModelRenderer[] tentacle9 = {this.tentacle9a, this.tentacle9b};
        AdvancedModelRenderer[] tentacle10 = {this.tentacle10a, this.tentacle10b};

        float speed = 0.13F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        this.chainWave(tentacle2, speed, -0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle6, speed, -0.3F, -2, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle8, speed, -0.3F, -2, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle4, speed, -0.3F, -2, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle10, speed, -0.3F, -2, f2, 1F);

        //Right:
        this.chainWave(tentacle1, speed, -0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle5, speed, -0.3F, -2, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle7, speed, -0.3F, -2, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle3, speed, -0.3F, -2, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle9, speed, -0.3F, -2, f2, 1F);

        if (e.isInWater()) {
            this.bob(shellbase, 0.18F, 1.0F, false, f2, 2);
            this.walk(shellbase, 0.3F, 0.2F, false, 0,0.2F,1.5F,1.0F);
        }
        else {
            this.shellbase.rotateAngleZ = (float) Math.toRadians(90);
            this.shellbase.offsetY = 1.45F;
        }

    }

}
